package HomeworksTataStrive;
public class MaxMin {
    public static void main(String[] args) {
        int a[]={23,45,23,53,23,56,7,64,34,56,7,5334,23,543,54332,334};
        int max=0,min=999;

        for(int t:a){
            if(t>max){
                max=t;
            }
            if(t<min){
                min=t;
            }
        }
        System.out.println(max + " " + min);
    }
}
