package testProject;

public class Test {
    public double mew;

    public Test(double mew){
        if (mew == 0){
            mew = 10;
        }
        this.mew = mew;
    }

    public double return_mew(){
        return mew;
    }
}
