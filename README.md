# CustomViewChart
PieChartView Example simple custom view

Okay what is a CustomView?

- A customView is basicly the same as the other Views but you can make your own one.
- Let say you need a chart for android like this one this one doesn't exist so you will have to create a new one.

How to make one?

- Well you can see how i made one but there are two ways of creating and it depends what you wuld like to do.
- You will have to extend View class or extend the ViewType that you want if you want to make a slight modification to existing
view. 
- Let say yu would like to make a completely new one there are a couple constructors and really depends what parameters you have
- You may need to create attr.xml to make the custom attributes that you wll like to prvide for your view.
- Or you can call a standart constructor.
- Don't forget to call invalidate() only where you need it. So the view can be recreated if need. Be carefull.
- Then you start drawing with onDraw() method.
- Use it as usual.

Good or bad?

- Well people say that a customView would be more light and really affect performance but i think a CustomView really have to
be a case where you need it and i would prefer to use a standart one if it already exist. Since creating a new View is really
a lot of work and it takes time.

- Other reason is that it can be backported which is the best thing of custom views.

- You can add Animators and Interolators and as many custom methods you would like to use and the good part is that like most
android libraries are made are just custom views that are reusable.

- So you can make a library and share it with others.

Wrap up?

- Well that is basicly everything about custom views other than making a TypeArray to add all the things.

- Check out Android Dev page for more info on the topic.

#### Author

- Niki Izvorski (nikiizvorski@gmail.com)
