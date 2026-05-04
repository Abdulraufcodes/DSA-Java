public class App {

    public static float shortestpath(String str){
        int x=0, y=0;

        for(int i=0; i<str.length(); i++){
            int dir = str.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'W'){
                x--;
            }
            else if(dir == 'E'){
                x++;
            }
            
        }
        int Xsqure = x*x;
        int Ysqure = y*y;

        float distance = (float) Math.sqrt(Xsqure+Ysqure);
        return distance;

    }
    public static void main(String[] args) throws Exception {
        String dir = "NS";

        System.out.println(shortestpath(dir));
    }
}
