package Adapter;

public class V5Adapter implements V5power {

    private V220power v220power;

    public V5Adapter(V220power v220power){
        this.v220power = v220power;
    }

    @Override
    public int providePower() {
        int t = this.v220power.providePower();
        System.out.println("转化电压：" +  t );
        System.out.println("提供5v");
        return 5;
    }
}
