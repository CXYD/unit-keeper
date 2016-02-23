## 简介

集成DBUnit,XMLUnit和JsonUnit等测试工具，完成DB,Redis,RocketMQ的数据测试和服务的Http请求单元测试<br>
简化单元测试成本，提高开发和测试的工作效率。

## 特性
*  可以进行测试用例的DB，Redis，RocketMQ数据准备；
*  可以完成测试用例的DB，Redis，RocketMQ结果验证；
*  可以采用（POST，GET）方式，发送JSON，XML或表单类型的数据到Rest风格的服务；
*  可以完成服务的请求返回结果（xml，json）的验证；
*  可以采用休眠等待的方式，完成作业的功能测试；
*  支持常用函数NULL,NOW(),IP等函数；
<br>

## 工作原理
![image](https://github.com/liubq100000/liubqresource/blob/master/unit-keeper.png)

## 开发流程
* Git clone 代码；
* 运行unit-keeper-test测试用例；
* 开发自己的用例；

##Demo（数据库测试场景）
测试功能入口：SimpleXmlTest<br>
连接对象配置：StockDBConnPool<br>
建库<br>
```sql
CREATE DATABASE IF NOT EXISTS testdb DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
```
建表语句：<br>
```sql
CREATE TABLE `test_table_0` (
  `tid0` bigint(20) NOT NULL DEFAULT '0',
  `cname0` varchar(64) DEFAULT NULL,
  `iage0` int(11) DEFAULT NULL,
  `last_changed_date` datetime DEFAULT NULL,
  PRIMARY KEY (`tid0`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `test_table_2` (
  `tid2` bigint(20) NOT NULL DEFAULT '0',
  `cname2` varchar(64) DEFAULT NULL,
  `iage2` int(11) DEFAULT NULL,
  `last_changed_date` datetime DEFAULT NULL,
  PRIMARY KEY (`tid2`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```
XML描述：<br>
```xml
<?xml version="1.0" encoding="UTF-8" ?>
<testfun>
	<action name="sleepAction" class="com.dangdang.unit.keeper.action.sleep.SleepAction">
		<param>1000</param>
	</action>
	
   <testcase name="TestCase" action="sleepAction" >
		<preparedataset>
			<preparedata storekey="testdb">
				<dataset>
				    <test_table_0>
					    <row tid0="1" cname0="测试1" iage0="31"/>
					    <row tid0="2" cname0="测试2" />
				    </test_table_0>
				</dataset>
			</preparedata>			
		</preparedataset>
		<resultdataset>
			<resultdata storekey="testdb">
				<dataset>
					<test_table_0 orderby="tid0 asc" >
					    <row tid0="1" cname0="测试1" iage0="31"/>
					    <row tid0="2" cname0="测试2" iage0=""/>
				    </test_table_0>
				    <test_table_2></test_table_2>
				</dataset>
			</resultdata>
		</resultdataset>
	</testcase>
</testfun>
```


