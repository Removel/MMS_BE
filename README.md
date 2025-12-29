# 个人后端入门小项目：社员管理系统
---
## 主要实现功能：
* 用户登录模块
    1. 用户注册
    2. 用户登录（用户名+密码）
    3. 退出登录
    4. （先不要求实现）token生成与验证
    5. （先不要求实现）密码加密与存储
* 社员信息管理模块
    1. 添加新社员
    2. 修改社员信息
    3. 删除社员（软删除）
    4. 查询社员列表（分页，主要用于多个查询与匹配）
    5. 查看社员详情
    6. 搜索社员（按照内容匹配，主要用于单个）
* 部分/分组管理模块
    1. 创建部门
    2. 修改部门信息
    3. 删除部门
    4. 部门成员管理
    5. 查看部门
* （暂不要求）活动管理模块
    1. 发布活动通知
    2. 修改活动信息
    3. 删除活动
    4. 活动报名管理
    5. 查看活动列表
    6. 活动签到记录
---
## 数据库设计
1. 用户表（user）
    1. id（主键）
    2. username（用户名）
    3. password（登陆密码）
    4. role（权限级别：root、社长、部长、干事、普通管理员）
    5. create_time（创建时间）
    6. update_time（最后一次更新时间）
2. 社员信息表（member）
    1. id（主键）
    2. name（姓名）
    3. student_id（学号）
    4. gender（性别）
    5. qq（QQ号）
    6. email（邮箱地址）
    7. department（隶属部门）
    8. status(状态：在读，毕业，退社)
    9. （可选）join_time(加入时间)
3. 部门表（department）
    1. id (主键)
    2. name (部门名称)
    3. description (部门描述)
    4. leader_id (部长ID)
    5. create_time (创建时间)
---
## api介绍与规定
1. 认证相关
    1. POST /auth/login - 登录
    2. POST /auth/register - 注册
    3. POST /auth/logout - 退出

2. 社员管理
    1. GET /members - 获取社员列表（分页）
    2. GET /members/{id} - 获取社员详情
    3. POST /members - 添加社员
    4. PUT /members/{id} - 修改社员
    5. DELETE /members/{id} - 删除社员
    6. GET /members/search - 搜索社员

3. 部门管理
    1. GET /departments - 获取所有部门
    2. POST /departments - 添加部门
    3. PUT /departments/{id} - 修改部门
    4. DELETE /departments/{id} - 删除部门

4. 活动管理(暂不使用)
GET /activities - 获取活动列表
POST /activities - 创建活动
PUT /activities/{id} - 修改活动
POST /activities/{id}/signup - 活动报名

## 程序设计（持续更新中）
=======
# 个人后端入门小项目：社员管理系统
---
## 主要实现功能：
* 用户登录模块
    1. 用户注册
    2. 用户登录（用户名+密码）
    3. 退出登录
    4. （先不要求实现）token生成与验证
    5. （先不要求实现）密码加密与存储
* 社员信息管理模块
    1. 添加新社员
    2. 修改社员信息
    3. 删除社员（软删除）
    4. 查询社员列表（分页，主要用于多个查询与匹配）
    5. 查看社员详情
    6. 搜索社员（按照内容匹配，主要用于单个）
* 部分/分组管理模块
    1. 创建部门
    2. 修改部门信息
    3. 删除部门
    4. 部门成员管理
    5. 查看部门
* （暂不要求）活动管理模块
    1. 发布活动通知
    2. 修改活动信息
    3. 删除活动
    4. 活动报名管理
    5. 查看活动列表
    6. 活动签到记录
---
## 数据库设计
1. 用户表（user）
    1. id（主键）
    2. username（用户名）
    3. password（登陆密码）
    4. role（权限级别：root、社长、部长、干事、普通管理员）
    5. create_time（创建时间）
    6. update_time（最后一次更新时间）
2. 社员信息表（member）
    1. id（主键）
    2. name（姓名）
    3. student_id（学号）
    4. gender（性别）
    5. qq（QQ号）
    6. email（邮箱地址）
    7. department（隶属部门）
    8. status(状态：在读，毕业，退社)
    9. （可选）join_time(加入时间)
3. 部门表（department）
    1. id (主键)
    2. name (部门名称)
    3. description (部门描述)
    4. leader_id (部长ID)
    5. create_time (创建时间)
---
## api介绍与规定
1. 认证相关
    1. POST /auth/login - 登录
    2. POST /auth/register - 注册
    3. POST /auth/logout - 退出

2. 社员管理
    1. GET /members - 获取社员列表（分页）
    2. GET /members/{id} - 获取社员详情
    3. POST /members - 添加社员
    4. PUT /members/{id} - 修改社员
    5. DELETE /members/{id} - 删除社员
    6. GET /members/search - 搜索社员

3. 部门管理
    1. GET /departments - 获取所有部门
    2. POST /departments - 添加部门
    3. PUT /departments/{id} - 修改部门
    4. DELETE /departments/{id} - 删除部门

4. 活动管理(暂不使用)
GET /activities - 获取活动列表
POST /activities - 创建活动
PUT /activities/{id} - 修改活动
POST /activities/{id}/signup - 活动报名

## 程序设计（持续更新中）
