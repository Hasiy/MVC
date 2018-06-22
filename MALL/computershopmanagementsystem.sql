/*
 Navicat Premium Data Transfer

 Source Server         : MYSQL
 Source Server Type    : MySQL
 Source Server Version : 50509
 Source Host           : localhost:3306
 Source Schema         : computershopmanagementsystem

 Target Server Type    : MySQL
 Target Server Version : 50509
 File Encoding         : 65001

 Date: 15/05/2018 00:43:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `TID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '物品id',
  `TName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `TCount` int(255) NOT NULL COMMENT '数量',
  `Tp` int(255) NOT NULL COMMENT '价格',
  `uid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '操作人编号',
  `uname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '操作人',
  PRIMARY KEY (`TID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for equipment
-- ----------------------------
DROP TABLE IF EXISTS `equipment`;
CREATE TABLE `equipment`  (
  `TID` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品编号',
  `TName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称（设备、物品名称）',
  `TType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品大分类',
  `TCount` int(10) NOT NULL COMMENT '商品库存数量',
  `TClass` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品归属仓库',
  `TStatus` int(10) NOT NULL COMMENT '商品库存状态（1为上架、2为下架）',
  `TSpec` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品品牌',
  `TUnit` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '单位（台、件等等）',
  `TUse` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '简介',
  `TConfiguration` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '售价',
  `TRecord` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '进价',
  `TCreatData` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '入库时间',
  PRIMARY KEY (`TID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of equipment
-- ----------------------------
INSERT INTO `equipment` VALUES ('0001', 'Apple MacBook Air 13.3英寸笔记本电脑', '品牌笔记本', 100, '1层100号', 1, 'Apple', '台', '银色(2017款Core i5 处理器/8GB内存/128GB闪存 MQD32CH/A)', '5868', '5300', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0002', 'Lenovo 拯救者R720 15.6英寸大屏游戏笔记本电脑', '品牌笔记本', 100, '1层200号', 1, '联想', '台', '黑金(i5-7300HQ 8G 1T+128G SSD GTX1050Ti 4G IPS ) ', '5799', '5200', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0003', '戴尔DELL成就5000不凡银13.3英寸商务办公超轻薄便携笔记本电脑', '品牌笔记本', 100, '1层300号', 1, 'DELL', '台', '银色(i5-8250U 8G 256GSSD IPS Win10)', '4799', '4300', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0004', 'ThinkPad 翼480（0VCD）14英寸轻薄窄边框笔记本电脑', '品牌笔记本', 100, '1层400号', 1, '联想', '台', '冰原银（i5-8250U 8G 128GSSD+500G 2G独显 FHD） ', '5999', '5400', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0005', 'ThinkPad 翼480（1BCD）14英寸轻薄窄边框笔记本电脑', '品牌笔记本', 1, '1层500号', 1, '牌子', '台', '冰原银（i7-8550U 8G 256GSSD 1T 2G独显 FHD）', '7499', '7300', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0006', 'ThinkPad E470（A3CD）14英寸笔记本电脑', '品牌笔记本', 100, '1层600号', 1, '联想', '台', '黑色（i5-7200U 8G 500G Win10）', '3999', '3000', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0007', 'Lenovo 拯救者Y720 GTX1060 15.6英寸大屏游戏笔记本电脑', '品牌笔记本', 100, '1层700号', 1, '联想', '台', 'i7-7300HQ 8G 1T+128G SSD GTX1060Ti 4G IPS', '8299', '8300', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0008', '小米(MI)Pro 15.6英寸金属轻薄笔记本', '品牌笔记本', 100, '1层800号', 1, '小米', '台', '深空灰 (i5-8250U 8G 256GSSD MX150 2G独显 FHD 指纹识别 预装office)', '5599', '5000', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0009', '荣耀MagicBook 14英寸轻薄窄边框笔记本电脑', '品牌笔记本', 100, '1层900号', 1, '华为', '台', '冰河银（i7-8550U 8G 256G MX150 2G独显 FHD IPS 正版Of2ce） ', '5699', '5300', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0010', '灵越游匣GTX1050 15.6英寸游戏笔记本电脑', '品牌笔记本', 100, '2层100号', 1, 'DELL', '台', '黑(i5-7300HQ 8G 128GSSD+1T 4G独显 IPS 散热快) ', '5868', '5300', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0011', 'Lenovo拯救者刃7000 UIY吃鸡游戏台式电脑主机', '品牌主机', 100, '2层200号', 1, '联想', '台', '黑 (i5-8400 8G 128G SSD 1T硬盘 GTX1060 Win10) ', '5299', '4999', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0012', 'Lenovo拯救者 刃9000 UIY吃鸡游戏台式电脑主机', '品牌主机', 100, '2层300号', 1, '联想', '台', '黑 (I7-10000 16G 256G SSD GTX1060 6G显卡 三年上门服务) ', '7899', '7600', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0013', 'HP光影精灵2代 吃鸡游戏台式电脑主机', '品牌主机', 100, '2层500号', 1, 'HP', '台', '黑绿（六核i7-10000 高频8G 128GSSD+1TB GTX1060 6G独显 三年上门) ', '6499', '5900', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0014', 'HP光影精灵3代 吃鸡游戏台式电脑主机', '品牌主机', 100, '2层600号', 1, 'HP', '台', '黑红（八代i7-8700 8G 128GSSD＋1T GTX1070 8G独显 三年上门） ', '10999', '9999', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0015', 'DELL灵越5680高性能“吃鸡”游戏台式电脑主机', '品牌主机', 100, '2层700号', 1, 'DELL', '台', '蓝黑(八代i7-8700 8G 128GSSD+1T GTX1060 6G独显 三年上门) ', '7499', '7300', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0016', 'DELL XPS8930高性能\"吃鸡\"游戏台式电脑主机', '品牌主机', 100, '2层800号', 1, 'DELL', '台', '银色 (八代i7-8700 16G 256GSSD+2T GTX1070 8G独显 三年上门 ) ', '11999', '11000', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0017', 'ThundeRobot 911黑武士 A56 吃鸡游戏台式电脑主机', '品牌主机', 100, '2层900号', 1, '雷神', '台', '银红（i5-8400 8G GTX1060 6G 1T+128G Win10） ', '5599', '5400', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0018', 'ThundeRobot Force T2 吃鸡游戏台式电脑主机', '品牌主机', 100, '3层100号', 1, '雷神', '台', '红黑 ( i5-8400 8G GTX1050Ti 4G 1T+128G 正版Win10) ', '4599', '4300', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0019', 'MSI 海皇戟3 Trident 3-044 吃鸡游戏台式电脑主机', '品牌主机', 2, '3层200号', 2, '微星', '台', '钢琴烤漆黑（i7-7700 16G 1T 256G GTX1060 6G WIN10） ', '8488', '8100', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0020', 'MSI 海皇戟3-极昼Trident3-Arctic-277 吃鸡游戏台式电脑主机', '品牌主机', 100, '3层300号', 1, '微星', '台', '极白（i7-7700 16G 1T+256G GTX1060 6G独显） ', '8488', '8200', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0021', 'Alienware ALPHA(阿尔法) \"吃鸡\"游戏台式电脑主机', '品牌主机', 100, '3层400号', 1, '外星人', '台', '雅黑 (i5-6400T 8G 1T GTX960 4G独显 三年送修服务) ', '5999', '5300', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0100', '微星（MSI）B360M MORTAR迫击炮 电竞“吃鸡”主板', '主板', 100, '4层100号', 1, 'MSI', '件', 'Intel B360/LGA 1151', '748', '700', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0101', '华硕（ASUS）PRIME B250M-PLUS 主板', '主板', 100, '4层200号', 1, '华硕', '件', 'Intel B250/LGA 1151', '599', '500', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0102', '华硕（ASUS）PRIME Z370-A 主板', '主板', 100, '4层300号', 1, '华硕', '件', 'Intel Z370/LGA 1151', '1699', '1500', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0103', '华硕 ASUS TUF B360M-PLUS GAMING 电竞特工 主板 吃鸡 国民电竞游戏主板（', '主板', 100, '4层400号', 1, '华硕', '件', 'Intel B360/LGA 1151', '779', '700', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0104', '华硕（ASUS）TUF Z370-PLUS GAMING 主板', '主板', 100, '4层500号', 1, '华硕', '件', 'Intel Z370/LGA 1151', '1399', '1200', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0200', 'AMD 锐龙 7 2700X 处理器', 'CPU', 100, '5层100号', 1, 'AMD', '件', '8核16线程 AM4 接口 3.7GHz 盒装CPU处理器 ', '2699', '2600', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0201', '英特尔（Intel） i7 8700K ', 'CPU', 3, '5层200号', 2, 'Intel', '件', '酷睿六核 盒装CPU处理器 ', '2599', '2500', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0202', '英特尔（Intel） i5 7500 ', 'CPU', 100, '5层300号', 1, 'Intel', '件', '酷睿四核 盒装CPU处理器 ', '1349', '1300', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0203', '英特尔（Intel） i7 7700K ', 'CPU', 100, '5层400号', 1, 'Intel', '件', '酷睿四核 盒装CPU处理器', '2349', '2349', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0204', '英特尔（Intel） i9 7900X', 'CPU', 100, '5层500号', 1, 'Intel', '件', '酷睿十核 盒装CPU处理器 ', '6499', '6100', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0205', '锐龙 AMD Threadripper （线程撕裂者）1900X 处理器', 'CPU', 100, '5层600号', 1, 'AMD', '件', '8核16线程 SocketTR4接口 3.8GHz 盒装CPU处理器 ', '2799', '2700', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0300', '三星（SAMSUNG）C27F390FHC 曲面电脑液晶显示器', '显示器', 5, '6层100号', 1, '三星', '件', '27英寸 1800R曲率 广视角低蓝光 HDMI ', '1349', '1300', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0341', '戴尔（DELL） U2417H ', '显示器', 100, '6层200号', 1, 'DELL', '件', '23.8英寸四边微边框旋转升降IPS屏 出厂色彩校准 99%sRGB ', '1549', '1500', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0342', 'AOC I2490VXH/BS ', '显示器', 100, '6层300号', 1, 'AOC', '件', '23.8英寸 1.5mm窄边框 AH-IPS硬屏 低蓝光爱眼不闪屏 24 （HDMI版）', '849', '800', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0343', '惠普（HP）24ES', '显示器', 100, '6层400号', 1, 'HP', '件', '23.8英寸 全高清IPS 纤薄机身 电脑屏幕 液晶显示器 内置HDMI接口 ', '899', '800', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0344', '华硕（ASUS）VG278Q ', '显示器', 100, '6层500号', 1, '华硕', '件', '27英寸144Hz刷新1ms响应 MOBA模式 （HDMI/DP/DVI接口+内置音箱） ', '2399', '2300', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0400', '华硕（ASUS）DUAL-GeForce GTX1060-O6G', '显卡', 1, '7层100号', 2, ' 华硕', '件', '1569-1809MHz 6G/8GHz GDDR5 雪豹系列游戏“吃鸡”显卡 ', '2499', '2400', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0441', '华硕（ASUS）ROG STRIX-GeForce GTX1060-O6G-GAMING', '显卡', 100, '7层200号', 1, ' 华硕', '件', '1645-1873MHz 8GHz GDDR5 猛禽电竞游戏“吃鸡”显卡', '2899', '2800', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0442', '七彩虹(Colorful)iGame1060烈焰战神S-6GD5 Top GTX1060 ', '显卡', 100, '7层300号', 1, '七彩虹', '件', '1594-1809MHz/8008MHz6G192bit吃鸡显卡', '2299', '2200', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0443', '索泰（ZOTAC）GTX1060 X-GAMING ', '显卡', 100, '7层400号', 1, '索泰', '件', '6GD5/1569-1784/8008MHz OC吃鸡显卡/游戏电竞台式机独立显卡 ', '2289', '2200', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0444', '微星（MSI）GTX 1080 Ti GAMING X TRIO ', '显卡', 100, '7层500号', 1, '微星', '件', '1683-1569MHz 352BIT 11GB GDDR5X ', '7299', '7200', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0500', '英睿达(Crucial) MX500系列 ', '硬盘', 100, '8层100号', 1, '英睿达', '件', '250G SATA3固态硬盘', '429', '400', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0541', '东芝(TOSHIBA) TR200系列 ', '硬盘', 2, '8层200号', 2, '东芝', '件', '240GB SATA3 固态硬盘', '399', '350', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0542', '闪迪(SanDisk) 至尊高速系列-3D版', '硬盘', 100, '8层300号', 1, '闪迪', '件', '1TB 固态硬盘 ', '2999', '2599', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0543', '金士顿(Kingston)A400系列 ', '硬盘', 100, '8层400号', 1, '金士顿', '件', '120G SATA3 固态硬盘', '249', '200', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0544', '三星(SAMSUNG) 970 PRO ', '硬盘', 100, '8层500号', 1, '三星', '件', '1TB M.2 NVMe 固态硬盘（MZ-V7P1T0BW）', '4499', '4099', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0600', '金士顿(Kingston)骇客神条 Fury系列', '内存', 100, '9层100号', 1, '金士顿', '件', 'DDR4 2400 8G 台式机内存', '659', '600', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0641', '芝奇(G.SKILL)幻光戟系列', '内存', 3, '9层200号', 1, '芝奇', '件', 'DDR4 3200频率 16G(8Gx2)套装 台式机内存 RGB灯条 ', '1449', '1400', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0642', '威刚(ADATA)XPG-威龙系列 ', '内存', 100, '9层300号', 1, '威刚', '件', 'DDR4 2400频 8GB 台式机内存 ', '569', '500', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0643', '金士顿(Kingston)骇客神条 Fury系列  ', '内存', 100, '9层400号', 1, '金士顿', '件', 'DDR4 2400 16G 台式机内存', '1379', '1300', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0700', '讯景（XFX）额定550W XTR550 ', '电源', 3, '10层100号', 1, '讯景', '件', '80PLUS金牌/全模组/5年质保/支持背线', '579', '560', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0741', '美商海盗船（USCorsair）额定650W RM650x ', '电源', 100, '10层200号', 1, '美商海盗船', '件', '80PLUS金牌/全模组/静音低载风扇停转/十年质保', '889', '800', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0742', '酷冷至尊（CoolerMaster）额定550W V550游戏电源', '电源', 100, '10层300号', 1, '酷冷至尊', '件', '80PLUS金牌/全模组/全日系电容/短机身/可背线/质保五年', '499', '400', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0743', '台达（Delta）额定350W NX350电源', '电源', 100, '10层400号', 1, '台达', '件', '80PLUS铜牌/全电压/12CM温控静音风扇/支持背线/主动式PFC/三年质保', '249', '200', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0744', 'EVGA 额定750W G3电源', '电源', 100, '10层500号', 1, 'EVGA', '件', '80PLUS金牌/全模组/10年质保/13cmHDB风扇/ECO节能/全日系电容', '899', '800', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0800', '恩杰 NZXT Kraken海妖 X72', '散热器', 4, '11层100号', 1, '恩杰', '件', '360mm一体式水冷散热器/可调色RGB水冷头/静音/耐久/散热/360mm冷排/三风扇', '1499', '1499', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0841', '美商海盗船（USCorsair）H100i V2', '散热器', 100, '11层200号', 1, '美商海盗船', '件', '一体式水冷/智能控温/RGB光控/5年质保/CPU多平台/24CM冷排/支持AM4/超频吃鸡利器', '859', '800', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0842', '酷冷至尊(Cooler Master)冰神B240', '散热器', 100, '11层300号', 1, '酷冷至尊', '件', 'CPU水冷散热器(支持I9 2066、AM4/双腔水泵/微流道设计/均衡型风扇)', '429', '400', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0843', '九州风神（DEEPCOOL） 玄冰400', '散热器', 50, '11层400号', 1, '九州风神', '件', '多平台/支持AM4/4热管/智能温控/发蓝光/12CM风扇/附带硅脂', '99', '90', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0900', '美商海盗船 (USCORSAIR) Carbide系列275R ', '机箱', 100, '12层100号', 1, '美商海盗船', '件', '钢化玻璃版 黑色 中塔 ATX 游戏机箱 ', '599', '500', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0941', '乔思伯（JONSBO）V4 ', '机箱', 100, '12层200号', 1, '牌子', '件', '银色 /支持MATX主板/全铝机箱/ATX电源/120MM高内散热器', '239', '200', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0942', '酷冷至尊（coolermaster）MasterBox Lite 5睿', '机箱', 100, '12层300号', 1, '酷冷至尊', '件', 'ATX主板/前镜面板/侧透/独立电源仓', '299', '299', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('0943', '先马（SAMA）黑洞 ', '机箱', 100, '12层400号', 1, '先马', '件', '黑色 中塔式机箱（支持ATX主板/配3把静音风扇/宽体游戏电脑机箱/支持长显卡/黑化背线）', '5868', '5300', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('1000', '罗技（Logitech）G502', '外设', 100, '13层100号', 1, '罗技', '件', ' 炫光自适应游戏鼠标 RGB鼠标 FPS鼠标', '379', '330', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('1041', 'Apple 妙控鼠标2/无线鼠标2代 ', '外设', 100, '13层200号', 1, 'Apple', '件', '触控- 银色 ', '489', '400', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('1042', '罗技（Logitech）MK275 无线光电键鼠套装 ', '外设', 100, '13层300号', 1, '罗技', '件', '适用于 Windows®, Chrome OS™ ', '5868', '5300', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('1043', 'ikbc C104 樱桃轴机械键盘 104键', '外设', 2, '13层400号', 2, 'ikbc ', '件', '黑色/白色 原厂Cherry轴  红轴/茶轴/青轴 游戏键盘', '379', '300', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('1044', '美商海盗船 (USCORSAIR) K68 机械键盘', '外设', 100, '13层500号', 1, '美商海盗船', '件', '黑色 Cherry红轴 红色背光 防泼溅防尘 ', '579', '530', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('1045', '闪迪（SanDisk）酷铄(CZ73)', '外设', 100, '13层500号', 1, '闪迪', '件', 'USB3.0 金属U盘 32GB 读150MB/秒 ', '69', '60', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('1046', '金士顿（Kingston）64GB U盘  ', '外设', 100, '13层600号', 1, '金士顿', '件', 'USB3.0 DTSE9G2  银色亮薄 读速100MB/s', '145', '120', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('1047', '西部数据（WD） Elements 新元素系列', '外设', 100, '13层700号', 1, '西部数据', '件', '2.5英寸 USB3.0 移动硬盘 1TB（WDBUZG0010BBK）', '369', '369', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('1100', '惠普（HP）大师本 ZBOOK15uG5-41', '服务器', 3, '14层100号', 1, 'HP', '台', '15.6/移动工作站i7-8550U/16G/512G.PCI.eSSD/2GB独显/W10H', '9999', '9200', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('1141', '惠普（HP）Z238(W2Z89PA) ', '服务器', 100, '14层200号', 1, 'HP', '台', '台式机 工作站 E3-1225v5/8GB ECC/1TB SATA/DVDRW/3年保修 ', '4599', '4000', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('1142', '戴尔R730 2U机架式服务器', '服务器', 100, '14层300号', 1, 'DELL', '台', 'E5-2620V4*2/16G*4/4T SAS*3热/H730-1G缓存/DVDRW/750W双电/导轨/三年', '28899', '28700', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('1143', '华为RH2288HV3服务器12盘', '服务器', 2, '14层400号', 2, '华为', '台', '2*E5-2630V4 ,4*16GB ,SR430 1G，8*2TSATA,4*GE,2*460W电源,滑轨', '46999', '46000', '2018-05-14 16:09:43');
INSERT INTO `equipment` VALUES ('1144', 'ThinkStation P320大机箱图形工作站30BGA04700', '服务器', 4, '14层500号', 1, '联想', '台', 'E3-1225V6/8G ECC/512G SSD/P600 2G/RAMBO/DOS', '8599', '8200', '2018-05-14 16:09:43');

-- ----------------------------
-- Table structure for recording
-- ----------------------------
DROP TABLE IF EXISTS `recording`;
CREATE TABLE `recording`  (
  `uid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
  `uname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户姓名',
  `TID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '物品编号',
  `TName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '物品名称（设备、物品名称）',
  `TUpdateData` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '操作时间',
  `notes` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '操作记录'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of recording
-- ----------------------------
INSERT INTO `recording` VALUES ('1000', '王锦', '0001', 'Apple MacBook Air 13.3英寸笔记本电脑', '2018-05-14 16:09:44', '入库');
INSERT INTO `recording` VALUES ('1000', '王锦', '0004', 'ThinkPad 翼480（0VCD）14英寸轻薄窄边框笔记本电脑', '2018-05-14 16:09:44', '入库');
INSERT INTO `recording` VALUES ('1000', '王锦', '0102', '华硕（ASUS）PRIME Z370-A 主板', '2018-05-14 16:09:44', '入库');
INSERT INTO `recording` VALUES ('1000', '王锦', '0012', 'HP光影精灵2代 ', '2018-05-14 16:09:44', '入库');
INSERT INTO `recording` VALUES ('1000', '王锦', '0342', 'AOC I2490VXH/BS ', '2018-05-14 16:09:44', '入库');
INSERT INTO `recording` VALUES ('1000', '王锦', '0442', '七彩虹(Colorful)iGame1060烈焰战神S-6GD5 Top GTX1060 ', '2018-05-14 16:09:44', '入库');
INSERT INTO `recording` VALUES ('1000', '王锦', '0542', '闪迪(SanDisk) 至尊高速系列-3D版', '2018-05-14 16:09:44', '入库');
INSERT INTO `recording` VALUES ('1000', '王锦', '0842', '酷冷至尊(Cooler Master)冰神B240', '2018-05-14 16:09:44', '入库');
INSERT INTO `recording` VALUES ('1000', '王锦', '0942', '酷冷至尊（coolermaster）MasterBox Lite 5睿', '2018-05-14 16:09:44', '入库');
INSERT INTO `recording` VALUES ('1000', '王锦', '1041', 'Apple 妙控鼠标2/无线鼠标2代 ', '2018-05-14 16:09:44', '入库');
INSERT INTO `recording` VALUES ('1000', '王锦', '1044', '美商海盗船 (USCORSAIR) K68 机械键盘', '2018-05-14 16:09:44', '入库');
INSERT INTO `recording` VALUES ('1000', '王锦', '1046', '金士顿（Kingston）64GB U盘 ', '2018-05-14 16:09:44', '入库');
INSERT INTO `recording` VALUES ('1000', '王锦', '1144', 'ThinkStation P320大机箱图形工作站30BGA04700', '2018-05-14 16:09:44', '入库');
INSERT INTO `recording` VALUES ('1000', '王锦', '0005', 'ThinkPad 翼480（1BCD）14英寸轻薄窄边框笔记本电脑', '2018-05-14 22:06:15', '修改库存');
INSERT INTO `recording` VALUES ('1000', '王锦', '0005', 'ThinkPad 翼480（1BCD）14英寸轻薄窄边框笔记本电脑', '2018-05-14 22:06:26', '修改库存');
INSERT INTO `recording` VALUES ('1000', '王锦', '0019', 'MSI 海皇戟3 Trident 3-044 吃鸡游戏台式电脑主机', '2018-05-14 22:07:06', '修改库存');
INSERT INTO `recording` VALUES ('1000', '王锦', '0201', '英特尔（Intel） i7 8700K ', '2018-05-14 22:07:17', '修改库存');
INSERT INTO `recording` VALUES ('1000', '王锦', '0541', '东芝(TOSHIBA) TR200系列 ', '2018-05-14 22:07:28', '修改库存');
INSERT INTO `recording` VALUES ('1000', '王锦', '1143', '华为RH2288HV3服务器12盘', '2018-05-14 22:07:46', '修改库存');
INSERT INTO `recording` VALUES ('1000', '王锦', '1043', 'ikbc C104 樱桃轴机械键盘 104键', '2018-05-14 22:07:58', '修改库存');
INSERT INTO `recording` VALUES ('1000', '王锦', '0400', '华硕（ASUS）DUAL-GeForce GTX1060-O6G', '2018-05-14 22:15:50', '修改库存');
INSERT INTO `recording` VALUES ('1000', '王锦', '0005', 'ThinkPad 翼480（1BCD）14英寸轻薄窄边框笔记本电脑', '2018-05-14 22:33:17', '入库');

-- ----------------------------
-- Table structure for sell
-- ----------------------------
DROP TABLE IF EXISTS `sell`;
CREATE TABLE `sell`  (
  `Tid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' COMMENT '物品编号',
  `Tname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '物品名称',
  `Tcount` int(255) NOT NULL COMMENT '数量',
  `Tprice` float(255, 0) NOT NULL COMMENT '单价',
  `Uname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '购买人',
  `Sdata` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '下单时间'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sell
-- ----------------------------
INSERT INTO `sell` VALUES ('0001', 'Apple MacBook Air 13.3英寸笔记本电脑', 100, 5868, '主管Z', '2018-05-14 16:10:23');
INSERT INTO `sell` VALUES ('0001', 'Apple MacBook Air 13.3英寸笔记本电脑', 88, 5868, '主管Z', '2018-05-14 16:13:43');
INSERT INTO `sell` VALUES ('0700', '讯景（XFX）额定550W XTR550 ', 22, 5868, '主管Z', '2018-05-14 22:00:13');
INSERT INTO `sell` VALUES ('1144', 'ThinkStation P320大机箱图形工作站30BGA04700', 19, 5868, '主管Z', '2018-05-14 22:00:19');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id（登录账号）',
  `upwd` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `uname` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户姓名',
  `upriority` int(2) NOT NULL COMMENT '用户权限（管理员1/普通用户2）',
  `usex` int(2) NOT NULL COMMENT '男1女2',
  `uidcard` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '身份证编号',
  `uposition` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '职位',
  `umajor` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '专业系别',
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1000', '123123', '王锦', 1, 2, '15261985711', 'CEO', '总公司');
INSERT INTO `user` VALUES ('1001', '123456', '管理员A', 1, 2, '15261985700', '库管', '分公司');
INSERT INTO `user` VALUES ('1003', '123456', '管理员C', 1, 2, '15261985788', '库管', '分公司');
INSERT INTO `user` VALUES ('1004', '123456', '管理员D', 1, 1, '15261985777', '库管', '分公司');
INSERT INTO `user` VALUES ('1005', '123456', '管理员E', 1, 1, '15261985727', '库管', '分公司');
INSERT INTO `user` VALUES ('1006', '123456', '管理员FFFF', 2, 2, '15261985744', '财务', '分公司');
INSERT INTO `user` VALUES ('2000', '123123', 'Z', 1, 1, '15261985733', 'CTO', '总公司');

SET FOREIGN_KEY_CHECKS = 1;
