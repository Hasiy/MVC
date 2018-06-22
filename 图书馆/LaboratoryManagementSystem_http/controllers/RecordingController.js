/**
 * Created by Administrator on 2017/5/16.
 */
app.controller('RecordingController', ['$rootScope', '$scope', '$http', function ($rootScope, $scope, $http) {
    console.log("RecordingController calleds");
  /*  Uid Uname TID TName TUpdateData Notes
*/
  $scope.SearchRecording = "";

  $scope.SearchRecordingSearch=function(){
    if($scope.SearchRecording == ""){
      $scope.SearchRecording = "SearchALL";
      var postData = "?SearchRecording=" + $scope.SearchRecording;
      var url = "http://localhost:8080/LaboratoryManagementSystem/RecordingADD"+postData;
      console.log(postData);
      $http.post(url).success(function(data) {
        $scope.dataRecordingSearch=data;
        console.log(data);

          var i;
          var list="";
          for(i=0;i<$scope.dataRecordingSearch.length;i++){
              list+=
                  "<tr>"+
                  "<td>"+(i+1)+ "</td>"+
                  "<td>"+$scope.dataRecordingSearch[i].Uid+ "</td>"+
                  "<td>"+$scope.dataRecordingSearch[i].Uname+ "</td>"+
                  "<td>"+$scope.dataRecordingSearch[i].TID+ "</td>"+
                  "<td>"+$scope.dataRecordingSearch[i].TName+ "</td>"+
                  "<td>"+$scope.dataRecordingSearch[i].TUpdateData+ "</td>"+
                  "<td>"+$scope.dataRecordingSearch[i].Notes+ "</td>"+
                  "</tr>"
          }
          $('tbody').append(list);
          console.log("list===="+list);

          $(document).ready(function(){
              $("#dt").DataTable();
          });

      })
    }else {
      var postData = "?SearchRecording=" + $scope.SearchRecording;
      var url = "http://localhost:8080/LaboratoryManagementSystem/RecordingADD"+postData;
      console.log(postData);
      $http.post(url).success(function(data) {
        $scope.dataRecordingSearch=data;
        console.log(data);


          var i;
          var list="";
          for(i=0;i<$scope.dataRecordingSearch.length;i++){
              list+=
                  "<tr>"+
                  "<td>"+(i+1)+ "</td>"+
                  "<td>"+$scope.dataRecordingSearch[i].Uid+ "</td>"+
                  "<td>"+$scope.dataRecordingSearch[i].Uname+ "</td>"+
                  "<td>"+$scope.dataRecordingSearch[i].TID+ "</td>"+
                  "<td>"+$scope.dataRecordingSearch[i].TName+ "</td>"+
                  "<td>"+$scope.dataRecordingSearch[i].TUpdateData+ "</td>"+
                  "<td>"+$scope.dataRecordingSearch[i].Notes+ "</td>"+
                  "</tr>"
          }
          $('tbody').append(list);
          console.log("list===="+list);

          $(document).ready(function(){
              $("#dt").DataTable();
          });

      })
    }
  }

    $scope.reload=function(){
        /*window.location.replace('#url');*///
        window.self.location.reload();

    }
}]);