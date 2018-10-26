#22
SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `goods_choiceness`;
CREATE TABLE `goods_choiceness` (
               `id` int(11) NOT NULL AUTO_INCREMENT,
               `goods_id`    varchar(16) NOT  NULL,
               `goods_name`  varchar(128) DEFAULT NULL,
               `goods_url`    varchar(1024) DEFAULT NULL,
               `goods_detail_url`    varchar(1024) DEFAULT NULL,
               `goods_1_category` varchar(32)  DEFAULT  NULL,
               `tao_bao_ke_url`    varchar(1024) DEFAULT NULL,
               `goods_price`    varchar(8) DEFAULT NULL,
               `monthl_sales_volume`  varchar(32)  DEFAULT  NULL,
               `income_rate`     varchar(8) DEFAULT NULL,
               `commission`    varchar(8) DEFAULT NULL,
              `seller_wang_wang`  varchar(64) DEFAULT NULL,
              `seller_id`  varchar(16) DEFAULT NULL,
              `shop_name`        varchar(128)  DEFAULT  NULL,
              `platform_type`    varchar(8) DEFAULT NULL,
              `discount_coupon_id`    varchar(64) DEFAULT NULL,
              `discount_coupon_sum`   varchar(8) DEFAULT NULL,
              `discount_coupon_residue`  varchar(8) DEFAULT NULL,
               `denomination`    varchar(128) DEFAULT NULL,
              `discount_coupon_begin_date`  varchar(64) DEFAULT NULL,
              `discount_coupon_end_date`  varchar(64) DEFAULT NULL,
              `generalize_url`  varchar(1024) DEFAULT NULL,
              `discount_coupon_generalize_url`  varchar(1024) DEFAULT NULL,
              PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
SET FOREIGN_KEY_CHECKS=1;


# 17
SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `goods_groupbuying`;
CREATE TABLE `goods_groupbuying` (
              `id` int(11) NOT NULL AUTO_INCREMENT,
              `goods_id` varchar(16)  DEFAULT  NULL comment '商品id',
              `goods_name` varchar(64)  DEFAULT  NULL comment '商品标题',
              `goods_price`    varchar(8) DEFAULT NULL comment '一人价（原价）',
              `group_purchase_price`    varchar(8) NOT  NULL comment '拼成价',
              `group_purchase_number`  varchar(8) DEFAULT NULL comment '几人团',
              `goods_url`    varchar(1024) DEFAULT NULL comment '商品主图',
              `goods_begin_date`  varchar(1024) DEFAULT NULL comment '开始时间',
              `goods_end_date`    varchar(8) DEFAULT NULL comment '结束时间',
              `inventory_number`     varchar(8) DEFAULT NULL comment '库存数量',
              `sold_number`       varchar(8) DEFAULT NULL comment '已售数量',
              `remain_number`    varchar(8) DEFAULT NULL comment '剩余库存',
              `generalize_long_url`    varchar(1024) DEFAULT NULL comment '推广长链接',
              `generalize_short_url`    varchar(1024) DEFAULT NULL comment '推广短链接',
              `commission_rate`  varchar(8) DEFAULT NULL comment '佣金比率（%）',
              `commission_price`  varchar(8) DEFAULT NULL comment '佣金金额',
              `primary_categories_id`  varchar(64) DEFAULT NULL comment '一级类目id',
              `primary_categories_name`  varchar(64) DEFAULT NULL comment '一级类目名称 ',
              PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
SET FOREIGN_KEY_CHECKS=1;


# 16
SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `goods_quality`;
CREATE TABLE `goods_quality` (
              `id` int(11) NOT NULL AUTO_INCREMENT,
              `category_name` varchar(32)  DEFAULT  NULL comment '类目名称',
              `seller_nickname`   varchar(32)  DEFAULT  NULL comment '卖家昵称',
              `platform_type`    varchar(8) DEFAULT NULL comment '平台类型',
              `goods_id`    varchar(16) NOT  NULL comment '商品id',
              `goods_name`  varchar(64) DEFAULT NULL comment '商品名称',
              `goods_url`    varchar(1024) DEFAULT NULL comment '商品推广链接',
              `goods_pic_url`  varchar(1024) DEFAULT NULL comment '商品主图',
              `goods_price`    varchar(8) DEFAULT NULL comment '商品价格(单位：元)',
              `income_rate`     varchar(8) DEFAULT NULL comment '收入比率(%)',
              `discounts_denomination`       varchar(8) DEFAULT NULL comment '优惠券面额(单位：元)',
              `discounts_sell_price`    varchar(8) DEFAULT NULL comment '券后价(单位：元)',
              `discounts_number`    varchar(11) DEFAULT NULL comment '优惠券总量',
              `discounts_remain_number`   varchar(8) DEFAULT NULL comment '优惠券剩余量',
              `discounts_begin_date`  varchar(64) DEFAULT NULL comment '优惠券开始时间',
              `discounts_end_date`  varchar(64) DEFAULT NULL comment '优惠券结束时间',
              `discounts_generalize_url`  varchar(1024) DEFAULT NULL comment '优惠券推广链接',
              PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
SET FOREIGN_KEY_CHECKS=1;