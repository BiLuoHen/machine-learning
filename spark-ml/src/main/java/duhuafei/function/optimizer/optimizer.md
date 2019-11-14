# 梯度下降

### 目的

最小化**目标函数**(objective function)

### 步骤

1. 确定假设函数与目标函数
- 线性回归假设函数
![](https://latex.codecogs.com/png.latex?\bg_white&space;f_{\theta}(x_{i})=\sum_{0}^{n}\theta_{i}x_{i}}), 
`n`为样本特征数和`θ`参数个数。
- 成本函数为
![](https://latex.codecogs.com/png.latex?\bg_white&space;C(\theta_{i})=\frac{1}{2m}\sum_{j=0}^{m}(f_{\theta}(x_{i}^{j})-y_{j})^{2}), 
`m`为样本个数。
- 目标函数为
![](https://latex.codecogs.com/png.latex?\bg_white&space;J(\theta_{i})=\frac{1}{2m}[\sum_{j=0}^{m}(f_{\theta}(x_{i}^{j})-y_{j})^{2}&plus;\lambda\sum_{i=0}^{n}\theta_{j}^{2}])。
- 梯度下降算法
![](https://latex.codecogs.com/png.latex?\bg_white&space;\theta_{j}:=\theta_{j}(1-\alpha\frac{\lambda}{m})-\alpha\frac{1}{m}\sum_{i=1}^{m}(f_{\theta}(x^{i})-y^{i})x_{j}^{i}), 
`m`为样本数, `α`为学习速率, `n`为特征数, `λ`为正则化参数。

2. 算法相关参数初始化,参数`θ`, 算法终止距离`ε`, 学习速率`α`。

3. 根据梯度下降过程更新`θ`, 直到对于所有`θ`梯度下降的距离小于`ε`。

### 备注: 逻辑回归

1. 目标函数
![](https://latex.codecogs.com/png.latex?\bg_white&space;J(\theta)=\frac{1}{m}\sum_{i=1}^{m}[-y^{i}log(f_{\theta}(x^{i}))-(1-y^{i}log(1-f_{\theta(x^{i})}))]&plus;\frac{\lambda}{2m}\sum_{j=1}^{n}\theta_{j}^{2})。

2. 梯度下降算法
![](https://latex.codecogs.com/png.latex?\bg_white&space;\theta_{j}:=\theta_{j}-\alpha[\frac{1}{m}\sum_{i=1}^{m}(f_{\theta}(x^{i})-y^{i})x_{j}^{i}&plus;\frac{\lambda}{m}\theta_{j}])。

### 参考
1. [梯度下降（Gradient Descent）小结](https://www.cnblogs.com/pinard/p/5970503.html)
2. [机器学习--正则化(Regularization)](https://blog.csdn.net/charles_thegod/article/details/83588212)