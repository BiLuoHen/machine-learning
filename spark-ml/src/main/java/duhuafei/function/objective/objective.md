# 损失函数 代价函数 目标函数

`obj=loss+Ω`

损失函数和代价函数是同一个东西，目标函数是一个与他们相关但更广的概念，
对于目标函数来说在有约束条件下的最小化就是损失函数（loss function）。

**目标函数**是最终需要优化的函数，其中包括**经验损失**和**结构损失**。
**经验损失**(loss)就是**损失函数**或者**代价函数**。**结构损失**(Ω)就是正则项之类的来控制模型复杂程度的函数。


线性模型`f(X)`，真实值记为`Y`。

为了表示拟合的好坏，我们就用一个函数来度量拟合的程度，比如： ![](https://latex.codecogs.com/png.latex?\bg_white&space;L(Y,f)=(Y-f)^{2})，
这个函数就称为损失函数(loss function)，或者叫代价函数(cost function)。

损失函数越小，就代表模型拟合的越好。那是不是我们的目标就只是让loss function越小越好呢？
还不是。这个时候还有一个概念叫风险函数(risk function)。
风险函数是损失函数的期望，这是由于我们输入输出的`(X,Y)`遵循一个联合分布，
但是这个联合分布是未知的，所以无法计算。但是我们是有历史数据的，就是我们的训练集，
`f(X)`关于训练集的平均损失称作经验风险(empirical risk)，
即![](https://latex.codecogs.com/png.latex?\bg_white&space;\frac{1}{N}\sum_{1}^{N}L(y_{i},f(x_{i})))，
所以我们的目标就是最小化![](https://latex.codecogs.com/png.latex?\bg_white&space;\frac{1}{N}\sum_{1}^{N}L(y_{i},f(x_{i})))，
称为**经验风险最小化**。

到这里完了吗？还没有。因为它会**过拟合**(over-fitting)。
我们不仅要让经验风险最小化，还要让结构风险最小化。这个时候就定义了一个函数`J(f)`，
这个函数专门用来度量模型的复杂度，在机器学习中也叫**正则化**(regularization)。
常用的有`L1`,`L2`范数。

到这一步我们就可以说我们最终的优化函数是：
![](https://latex.codecogs.com/png.latex?\bg_white&space;min(\frac{1}{N}\sum_{1}^{N}L(y_{i},f(x_{i})))&plus;\lambda&space;J(f)))，
即**最优化经验风险和结构风险**，
而这个函数就被称为**目标函数**(objective function)。

参考来源: [机器学习中的目标函数、损失函数、代价函数有什么区别？](https://www.zhihu.com/question/52398145)