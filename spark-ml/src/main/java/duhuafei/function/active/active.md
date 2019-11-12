# 激活函数

### Sigmoid

![](https://latex.codecogs.com/png.latex?\bg_white&space;\large&space;g(z)=\frac{1}{1-e^{-z}})

### Tanh

![](https://latex.codecogs.com/png.latex?\bg_white&space;\large&space;g(z)=\frac{e^{z}-e^{-z}}{e^{z}+e^{-z}})

### ReLU

![](https://latex.codecogs.com/png.latex?\bg_white&space;\large&space;g(z)=\left\\{\begin{matrix}&space;z&if&z>0&space;\\\\&space;0&if&z\leqslant0&space;\end{matrix}\right.)

等价于`g(z)=max(0,z)`

### PReLU

![](https://latex.codecogs.com/png.latex?\bg_white&space;\large&space;g(z)=\left\\{\begin{matrix}&space;1&if&z>0&space;\\\\&space;az&if&z\leqslant0&space;\end{matrix}\right.;0<a<1)

等价于`g(z)=max(az,z)`