SET
    character_set_client = utf8mb4;

SET
    character_set_connection = utf8mb4;

SET
    character_set_filesystem = utf8mb4;

SET
    character_set_results = utf8mb4;

-- 删除数据库 aaa（如果它存在的话）
DROP DATABASE IF EXISTS aaa;

-- 创建新的数据库 aaa
CREATE DATABASE aaa DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;

-- 切换到新创建的数据库 aaa
USE aaa;

-- 创建Ticket表
CREATE TABLE Ticket (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    num INT
) DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

-- 插入数据
INSERT INTO Ticket (name, num) VALUES ('A', 100);
INSERT INTO Ticket (name, num) VALUES ('B', 100);
INSERT INTO Ticket (name, num) VALUES ('C', 100);