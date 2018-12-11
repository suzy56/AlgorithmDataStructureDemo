package Commond;

public class QuickCommond implements Commond {

    private Commond[] commonds;

    public QuickCommond(Commond[] commonds){
        this.commonds = commonds;
    }

    @Override
    public void excute() {
        for (int i=0; i<commonds.length; i++){
            commonds[i].excute();
        }
    }
}
