# DataStructure

![Java](https://img.shields.io/badge/Java-8+-orange.svg)

> 经典数据结构与基础算法的 Java 手写实现，按主题分包，每包含可运行 demo 与测试。

## 项目简介
涵盖数据结构课程与面试常见考点：栈、链表、树、查找与基础算法。每个 package 都是一个独立主题，含 `main` 方法和针对该结构的操作实现，强调"自己动手实现"而非直接调用标准库。

## 环境要求
- Java 8 及以上
- 无需构建工具，直接 `javac` 编译运行

## 目录结构（按主题）
```
src/
├── SequenceStack/           # 顺序栈（含 Stack 接口、括号匹配 BracketsCheck）
├── linkList/                # 单链表
├── doubleLinkList/          # 双向链表
├── fibonacci/               # 斐波那契数列
├── Tree/                    # 二叉树（创建与前 / 中 / 后序遍历）
├── binarySearch/            # 二分查找（循环 / 递归）
├── depthFirstSearch/        # 深度优先搜索
└── greedyAlgorithm_change/  # 贪心算法——找零问题
```

## 运行方式
```bash
javac src/SequenceStack/*.java
java SequenceStack.SequenceStackTest
```

## 说明
- 个人学习项目，侧重基础算法手感训练。
- 仓库未声明开源协议（LICENSE）。
