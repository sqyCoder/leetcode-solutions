# LeetCode 刷题存档

> 面向校招 / 互联网笔试面试的算法刷题记录。**全部代码均为 AC 提交**，按题型成组，不追求题量堆砌，追求「同一类题的解法能迁移」。

<p>
  <img alt="语言" src="https://img.shields.io/badge/Java-47-ED8B00?style=flat-square&logo=openjdk&logoColor=white">
  <img alt="语言" src="https://img.shields.io/badge/C%2B%2B-6-00599C?style=flat-square&logo=cplusplus&logoColor=white">
  <img alt="题目" src="https://img.shields.io/badge/题目-53-FFA116?style=flat-square&logo=leetcode&logoColor=white">
</p>

---

## 这个仓库是什么

刷题存档，不是题解仓库：

- **只放 AC 过的代码**，不放未通过、不放别人的答案；
- **按专题成组**，同一类题放在一起看，能看出解法的演化（比如链表的快慢指针、二叉树的前中后序递归与迭代）；
- **不写长题解**，关键思路写在代码注释里——因为脱离代码的题解没有意义；
- **Java 为主**，位运算那批用 C++ 写（位运算在 C++ 里更直观，也是笔试常见语言）。

---

## 题目清单

### 位运算（C++）

| 题号 | 题目 | 技巧 |
| --- | --- | --- |
| [136](136.cpp) | 只出现一次的数字 | 异或的自反性 `a^a=0` |
| [190](190.cpp) | 颠倒二进制位 | 逐位取反后左移 |
| [191](191.cpp) | 位 1 的个数 | `n & (n-1)` 消掉最低位的 1 |
| [231](231.cpp) | 2 的幂 | `n & (n-1) == 0` |
| [268](268.cpp) | 丢失的数字 | 异或 / 求和作差 |
| [476](476.cpp) | 数字的补数 | 构造同位数全 1 掩码 |

> 这 6 题是位运算的「最小完备集」：异或消重、位计数、掩码。面试里位运算题基本都能拆成这几个动作的组合。

### 链表

| 题号 | 题目 | 关键点 |
| --- | --- | --- |
| [206](leetcode206.java) | 反转链表 | 三指针迭代 / 递归 |
| [203](leetcode203.java) | 移除链表元素 | 虚拟头节点 |
| [21](leetcode21.java) | 合并两个有序链表 | 哑节点 + 尾插 |
| [160](leetcode160.java) | 相交链表 | 双指针走完各自再换头 |
| [141](leetcode141.java) | 环形链表 | 快慢指针判相遇 |
| [142](leetcode142.java) | 环形链表 II | 相遇后一指针回头，同速再遇即入环点 |
| [876](leetcode876.java) | 链表的中间结点 | 快慢指针 |
| [138](leetcode138.java) | 随机链表的复制 | 哈希表映射 / 原地拼接拆分 |

### 二叉树

| 题号 | 题目 |
| --- | --- |
| [94](leetcode94.java) / [144](leetcode144.java) / [145](leetcode145.java) | 中序 / 前序 / 后序遍历 |
| [102](leetcode102.java) | 二叉树的层序遍历 |
| [100](leetcode100.java) / [101](leetcode101.java) | 相同的树 / 对称二叉树 |
| [110](leetcode110.java) | 平衡二叉树 |
| [226](leetcode226.java) | 翻转二叉树 |
| [236](leetcode236.java) | 二叉树的最近公共祖先 |
| [105](leetcode105.java) / [106](leetcode106.java) | 由遍历序列构造二叉树 |
| [572](leetcode572.java) | 另一棵树的子树 |
| [606](leetcode606.java) | 根据二叉树创建字符串 |

### 数组 / 双指针 / 滑动窗口

| 题号 | 题目 | 题型 |
| --- | --- | --- |
| [26](leetcode26.java) / [27](leetcode27.java) | 删除有序数组重复项 / 移除元素 | 快慢指针原地删除 |
| [88](leetcode88.java) | 合并两个有序数组 | 从后往前双指针 |
| [283](leetcode283.java) | 移动零 | 快慢指针 |
| [189](leetcode189.java) | 轮转数组 | 三次反转 |
| [209](leetcode209.java) | 长度最小的子数组 | 滑动窗口 |
| [11](leetcode11.java) | 盛最多水的容器 | 对撞双指针 |
| [15](leetcode15.java) / [18](leetcode18.java) | 三数之和 / 四数之和 | 排序 + 双指针 + 去重 |
| [611](leetcode611.java) | 有效三角形的个数 | 排序 + 双指针计数 |
| [1004](leetcode1004.java) | 最大连续 1 的个数 III | 可变窗口 |
| [1089](leetcode1089.java) | 复写零 | 两次遍历 |
| [209](leetcode209.java) | 长度最小的子数组 | 窗口收缩条件 |

### 字符串 / 哈希

| 题号 | 题目 |
| --- | --- |
| [3](leetcode3.java) | 无重复字符的最长子串 |
| [125](leetcode125.java) | 验证回文串 |
| [387](leetcode387.java) | 字符串中的第一个唯一字符 |
| [434](leetcode434.java) | 字符串中的单词数 |
| [709](leetcode709.java) | 转换成小写字母 |
| [771](leetcode771.java) | 宝石与石头 |
| [1704](leetcode1704.java) | 判断字符串的两半是否相似 |
| [0202](leetcode0202.java) | 快乐数 |

### 栈 / 队列 / 其他

| 题号 | 题目 |
| --- | --- |
| [20](leetcode20.java) | 有效的括号 |
| [155](leetcode155.java) | 最小栈 |
| [150](leetcode150.java) | 逆波兰表达式求值 |
| [136](leetcode136.java) / [136v2](leetcode136v2.java) | 只出现一次的数字（Java 两种写法） |
| [lcr179](leetcodelcr179.java) | 查找总价格为目标值的两个商品 |
| [ms1714](ms1714.java) | 面试题 17.14 最小 K 个数 |

---

## 怎么用这个仓库

**如果你也在准备面试**，建议不要按顺序刷，而是按「专题」刷：

1. 挑一个专题（比如链表），把这里同专题的题一次做完；
2. 做完之后回头看一眼代码注释里的「关键点」，这些才是能迁移的东西；
3. 隔一周重做一遍，能一次写对才算会。

**同一个题的多版本**（如 `leetcode136` 与 `leetcode136v2`）保留了不同思路，不要删——对比着看比只看最优解有用。

---

## 命名约定

| 前缀 | 含义 |
| --- | --- |
| `leetcode<数字>.java` | LeetCode 题号对应的 Java 实现 |
| `<数字>.cpp` | LeetCode 题号对应的 C++ 实现 |
| `leetcodelcr179.java` | 剑指 Offer / LCR 系列题号 |
| `ms1714.java` | 面试题（`ms` = 面试）编号 |
| `v2` 后缀 | 同一题的第二种解法 |

> `.exe` 是 Windows 下编译产生的中间产物，保留是为了方便本机直接验算，不是交付物。

---

## License

个人学习存档，代码可自由参考。题目版权归 LeetCode 所有。
