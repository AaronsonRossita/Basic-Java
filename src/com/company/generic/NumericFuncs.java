package com.company.generic;

public class NumericFuncs<T extends Number> {

    T num;

    public NumericFuncs(T num) {
        this.num = num;
    }

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }

    public double square(){
        return num.intValue() * num.doubleValue();
    }

    public boolean absValue(NumericFuncs<?> x){
        if (Math.abs(num.intValue()) == Math.abs(x.num.doubleValue()))
            return true;
        return false;
    }
}
