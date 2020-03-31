set names utf8;
set foreign_key_checks=0;

drop database if exists milkyway;
create database if not exists milkyway;

use milkyway;

create table user_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) unique not null comment "ユーザーID",
password varchar(16) not null comment "パスワード",
family_name varchar(32) not null comment "姓",
first_name varchar(32) not null comment "名",
family_name_kana varchar(32) not null comment "姓かな",
first_name_kana varchar(32) not null comment "名かな",
sex tinyint default 0 comment "性別",
email varchar(32) comment "メールアドレス",
status tinyint default 0 comment "ステータス",
logined tinyint not null default 0 comment "ログインフラグ",
regist_date datetime  not null comment"登録日時",
update_date datetime comment "更新日時"
)
default charset=utf8
comment="会員情報テーブル"
;

create table product_info(
id int primary key not null auto_increment comment "ID",
product_id int unique not null comment "商品ID",
product_name varchar(100) unique not null comment "商品名",
product_name_kana varchar(100) unique not null comment "商品名かな",
product_description varchar(255) comment "商品詳細",
category_id int not null comment "カテゴリID",
price int not null comment "値段",
image_file_path varchar(100) not null comment "画像ファイルパス",
image_file_name varchar(50) not null comment "画像ファイル名",
release_date datetime comment "発売年月",
release_company varchar(50) comment "発売会社",
status tinyint default 1 comment "ステータス",
regist_date datetime  not null comment"登録日時",
update_date datetime comment "更新日時",
foreign key(category_id) references m_category(category_id)
)
default charset=utf8
comment="商品情報テーブル";

create table cart_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
product_id int not null comment "商品ID",
product_count int not null comment "個数",
regist_date datetime  not null comment"登録日時",
update_date datetime comment "更新日時",
foreign key(product_id) references product_info(product_id)
)
default charset=utf8
comment="カート情報テーブル"
;

create table purchase_history_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
product_id int not null comment "商品ID",
product_count int not null comment "個数",
price int not null comment "値段",
destination_id int not null comment "宛先情報ID",
regist_date datetime  not null comment"登録日時",
update_date datetime comment "更新日時",
foreign key(user_id) references user_info(user_id),
foreign key(product_id) references product_info(product_id)
)
default charset=utf8
comment="購入履歴情報テーブル"
;

create table destination_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
family_name varchar(32) not null comment "姓",
first_name varchar(32) not null comment "名",
family_name_kana varchar(32) not null comment "姓かな",
first_name_kana varchar(32) not null comment "名かな",
email varchar(32) comment "メールアドレス",
tel_number varchar(13) comment "電話番号",
user_address varchar(50) not null comment "住所",
regist_date datetime  not null comment"登録日時",
update_date datetime comment "更新日時",
foreign key(user_id) references user_info(user_id)
)
default charset=utf8
comment="宛先情報テーブル"
;

create table m_category(
id int primary key not null auto_increment comment "ID",
category_id int not null unique comment "カテゴリID",
category_name varchar(20) not null unique comment "カテゴリ名",
category_description varchar(100) comment "カテゴリ詳細",
regist_date datetime  not null comment"登録日時",
update_date datetime comment "更新日時"
)
default charset=utf8
comment="カテゴリマスタテーブル"
;

set foreign_key_checks=1;

insert into user_info values
(1,"guest","guest","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",1,0,now(),now()),
(2,"guest2","guest2","インターノウス","ゲストユーザー2","いんたーのうす","げすとゆーざー2",0,"guest2@gmail.com",0,0,now(),now()),
(3,"guest3","guest3","インターノウス","ゲストユーザー3","いんたーのうす","げすとゆーざー3",0,"guest3@gmail.com",0,0,now(),now()),
(4,"guest4","guest4","インターノウス","ゲストユーザー4","いんたーのうす","げすとゆーざー4",0,"guest4@gmail.com",0,0,now(),now()),
(5,"guest5","guest5","インターノウス","ゲストユーザー5","いんたーのうす","げすとゆーざー5",0,"guest5@gmail.com",0,0,now(),now()),
(6,"guest6","guest6","インターノウス","ゲストユーザー6","いんたーのうす","げすとゆーざー6",0,"guest6@gmail.com",0,0,now(),now()),
(7,"guest7","guest7","インターノウス","ゲストユーザー7","いんたーのうす","げすとゆーざー7",0,"guest7@gmail.com",0,0,now(),now()),
(8,"guest8","guest8","インターノウス","ゲストユーザー8","いんたーのうす","げすとゆーざー8",0,"guest8@gmail.com",0,0,now(),now()),
(9,"guest9","guest9","インターノウス","ゲストユーザー9","いんたーのうす","げすとゆーざー9",0,"guest9@gmail.com",0,0,now(),now()),
(10,"guest10","guest10","インターノウス","ゲストユーザー10","いんたーのうす","げすとゆーざー10",0,"guest10@gmail.com",0,0,now(),now()),
(11,"guest11","guest11","インターノウス","ゲストユーザー11","いんたーのうす","げすとゆーざー11",0,"guest11@gmail.com",0,0,now(),now()),
(12,"guest12","guest12","インターノウス","ゲストユーザー12","いんたーのうす","げすとゆーざー12",0,"guest12@gmail.com",0,0,now(),now());

insert into m_category values
(1,1,"全てのカテゴリー","本、家電・パソコン、おもちゃ・ゲーム全てのカテゴリーが対象となります",now(), now()),
(2,2,"本","本に関するカテゴリーが対象となります",now(),now()),
(3,3,"家電・パソコン","家電・パソコンに関するカテゴリーが対象となります",now(),now()),
(4,4,"おもちゃ・ゲーム","おもちゃ・ゲームに関するカテゴリーが対象となります",now(),now()),
(5,5,"CD","CDに関するカテゴリーが対象となります",now(),now());

INSERT INTO product_info (id,product_id,product_name,product_name_kana,product_description,category_id,price,
image_file_path,image_file_name,release_date,release_company,status,regist_date,update_date)  values
(1,1,'名言集','めいげんしゅう','あなたの人生が変わる一冊',2,2000,'./images/',
'meigensyu_book.jpg','2020/03/01','ミルキーウェイブック株式会社',1,now(),now());

INSERT INTO product_info (id,product_id,product_name,product_name_kana,product_description,category_id,price,
image_file_path,image_file_name,release_date,release_company,status,regist_date,update_date)  values
(2,2,'コミック','こみっく','1000万部突破！人気漫画最新刊！',2,484,'./images/',
'comic_book.jpg','2020/03/01','ミルキーウェイブック株式会社',1,now(),now());

INSERT INTO product_info (id,product_id,product_name,product_name_kana,product_description,category_id,price,
image_file_path,image_file_name,release_date,release_company,status,regist_date,update_date)  values
(3,3,'六法全書','ろっぽうぜんしょ','民法改正2020年最新版！',2,13570,'./images/',
'roppouzensyo_book.jpg','2020/03/01','ミルキーウェイブック株式会社',1,now(),now());

INSERT INTO product_info (id,product_id,product_name,product_name_kana,product_description,category_id,price,
image_file_path,image_file_name,release_date,release_company,status,regist_date,update_date)  values
(4,4,'ルールブック','るーるぶっく','ゲームのルールがまるわかり！',2,6490,'./images/',
'rule_book.jpg','2020/03/01','ミルキーウェイブック株式会社',1,now(),now());

INSERT INTO product_info (id,product_id,product_name,product_name_kana,product_description,category_id,price,
image_file_path,image_file_name,release_date,release_company,status,regist_date,update_date)  values
(5,5,'音楽雑誌','おんがくざっし','最新チャート掲載しています。',2,680,'./images/',
'music_book.jpg','2020/03/01','ミルキーウェイブック株式会社',1,now(),now());

INSERT INTO product_info (id,product_id,product_name,product_name_kana,product_description,category_id,price,
image_file_path,image_file_name,release_date,release_company,status,regist_date,update_date)  values
(6,6,'延長コード','えんちょうこーど','トラッキング火災予防絶縁キャップ付き。延長コード1.5m/ホワイト',3,642,'./images/',
'kaden_enchou_cable.jpg','2019/10/01','ミルキーウェイ電気株式会社',1,now(),now());

INSERT INTO product_info (id,product_id,product_name,product_name_kana,product_description,category_id,price,
image_file_path,image_file_name,release_date,release_company,status,regist_date,update_date)  values
(7,7,'ノートパソコン','のーとぱそこん','コンパクトでどこでも持ち運び可能。windows10/Corei5/メモリ8GB/SSD/ブルー/ミルキーウェイ限定',3,136900,'./images/',
'kaden_pc.jpg','2019/12/09','ミルキーウェイ電気株式会社',1,now(),now());

INSERT INTO product_info (id,product_id,product_name,product_name_kana,product_description,category_id,price,
image_file_path,image_file_name,release_date,release_company,status,regist_date,update_date)  values
(8,8,'ドラム式洗濯機','どらむしきせんたくき','ドラム式洗濯乾燥機。洗濯11Kg/洗濯～乾燥6kg。右開き。日本製。',3,208000,'./images/',
'kaden_sentakuki.jpg','2019/05/09','ミルキーウェイ電気株式会社',1,now(),now());

INSERT INTO product_info (id,product_id,product_name,product_name_kana,product_description,category_id,price,
image_file_path,image_file_name,release_date,release_company,status,regist_date,update_date)  values
(9,9,'電子レンジ','でんしれんじ','単機能電子レンジ。22L。ワンタッチあたため解凍機能付き。ブラック',3,11580,'./images/',
'kaden_microwave.jpg','2019/11/29','ミルキーウェイ電気株式会社',1,now(),now());

INSERT INTO product_info (id,product_id,product_name,product_name_kana,product_description,category_id,price,
image_file_path,image_file_name,release_date,release_company,status,regist_date,update_date)  values
(10,10,'サイクロン掃除機','さいくろんそうじき','キャニスター型サイクロン　クリーナー　コード付き',3,9480,'./images/',
'kaden_soujiki_cyclone.jpg','2019/02/23','ミルキーウェイ電気株式会社',1,now(),now());

INSERT INTO product_info (id,product_id,product_name,product_name_kana,product_description,category_id,price,
image_file_path,image_file_name,release_date,release_company,status,regist_date,update_date)  values
(11,11,'タンガタ・マヌのぬいぐるみ','たんがた・まぬのぬいぐるみ','イースター島に伝わる鳥の頭とニンゲンの体を持つ神、タンガタ・マヌ（鳥人）のぬいぐるみ',4,2180,'./images/',
'tangatamanu.jpg','2019/02/06','株式会社ぬいぐるみ',1,now(),now());

INSERT INTO product_info (id,product_id,product_name,product_name_kana,product_description,category_id,price,
image_file_path,image_file_name,release_date,release_company,status,regist_date,update_date)  values
(12,12,'ねこのぬいぐるみ','ねこのぬいぐるみ','立った状態のねこのぬいぐるみ。お買い得商品',4,980,'./images/',
'cat.jpg','2019/08/08','株式会社ぬいぐるみ',1,now(),now());

INSERT INTO product_info (id,product_id,product_name,product_name_kana,product_description,category_id,price,
image_file_path,image_file_name,release_date,release_company,status,regist_date,update_date)  values
(13,13,'アマゾンカワイルカのぬいぐるみ','あまぞんかわいるかのぬいぐるみ','淡水に生息するピンク色の珍しいイルカ、アマゾンカワイルカのぬいぐるみ。等身大サイズの250ｃｍ！',4,3980,'./images/',
'animal_amazon_kawairuka.jpg','2019/04/13','株式会社ぬいぐるみ',1,now(),now());

INSERT INTO product_info (id,product_id,product_name,product_name_kana,product_description,category_id,price,
image_file_path,image_file_name,release_date,release_company,status,regist_date,update_date)  values
(14,14,'UFOのおもちゃ','UFOのおもちゃ','UFOのおもちゃ。ボタンでライトが点きます。',4,500,'./images/',
'ufo.jpg','2019/12/22','株式会社トイズトミー',1,now(),now());

INSERT INTO product_info (id,product_id,product_name,product_name_kana,product_description,category_id,price,
image_file_path,image_file_name,release_date,release_company,status,regist_date,update_date)  values
(15,15,'ゲームソフト「ソニ天堂物語」','げーむそふとそにてんどうものがたり','ソニ天堂期待の新作RPGがここに生まれる！',4,4980,'./images/',
'game.jpg','2019/10/25','株式会社ソニ天堂',1,now(),now());

INSERT INTO product_info (id,product_id,product_name,product_name_kana,product_description,category_id,price,
image_file_path,image_file_name,release_date,release_company,status,regist_date,update_date)  values
(16,16,'シーズンベスト','しーずんべすと','春夏秋冬のベストアルバムです。',5,1200,'./images/',
'CD_1.jpg','2019/02/06','株式会社シスターズジャパン',1,now(),now());

INSERT INTO product_info (id,product_id,product_name,product_name_kana,product_description,category_id,price,
image_file_path,image_file_name,release_date,release_company,status,regist_date,update_date)  values
(17,17,'サマーソング','さまーそんぐ','夏をモチーフにした曲です。',5,500,'./images/',
'CD_2.jpg','2019/08/08','Cbex株式会社',1,now(),now());

INSERT INTO product_info (id,product_id,product_name,product_name_kana,product_description,category_id,price,
image_file_path,image_file_name,release_date,release_company,status,regist_date,update_date)  values
(18,18,'スプリングソング','すぷりんぐそんぐ','春をモチーフにした曲です。',5,700,'./images/',
'CD_3.jpg','2019/04/13','アニプレメント株式会社',1,now(),now());

INSERT INTO product_info (id,product_id,product_name,product_name_kana,product_description,category_id,price,
image_file_path,image_file_name,release_date,release_company,status,regist_date,update_date)  values
(19,19,'ウィンターソング','うぃんたーそんぐ','冬をモチーフにした曲です。',5,800,'./images/',
'CD_4.jpg','2019/12/22','株式会社ミュージック',1,now(),now());

INSERT INTO product_info (id,product_id,product_name,product_name_kana,product_description,category_id,price,
image_file_path,image_file_name,release_date,release_company,status,regist_date,update_date)  values
(20,20,'オータムソング','おーたむそんぐ','秋をモチーフにした曲です。',5,600,'./images/',
'CD_5.jpg','2019/10/25','株式会社ミュージックレコード',1,now(),now());
