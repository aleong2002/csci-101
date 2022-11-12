package midterm2.java;

public abstract class Vehiclee {
protected String model;

public Vehiclee(){
}

public Vehiclee(String model){
this.model = model;
}

abstract void go();
abstract void stop();

public String getModel(){
return this.model;
}

public void setModel(String model){
this.model = model;
}
}
