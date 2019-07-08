package ArrayRelated;

public class array01 {



    public static void main(String[] args){
        int[] a= new int[10];    //一旦建立，长度不可变
        float[]  b = new float[10];
        tablet[] computer= new tablet[2];  //自建类也可以

        //赋值
        for (int i=0;i<a.length;i++){
            a[i]=i*i;
        }

        //类array
        computer[0]=new tablet("i5","16G","1T","highspeed","2080");
        computer[0].str();

        //


    }
}



class tablet{
    String CPU;
    String Memory;
    String Disk;
    String Bus;
    String Graphic_Card;

    public tablet(String CPU, String Memory, String Disk, String Bus, String Graphic_Card) {
        this.CPU=CPU;
        this.Memory=Memory;
        this.Disk=Disk;
        this.Bus=Bus;
        this.Graphic_Card=Graphic_Card;
    }

    public void str(){
        System.out.println(this.CPU);
        System.out.println(this.Memory);
        System.out.println(this.Disk);
        System.out.println(this.Bus);
        System.out.println(this.Graphic_Card);
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setMemory(String memory) {
        Memory = memory;
    }

    public void setDisk(String disk) {
        Disk = disk;
    }

    public void setBus(String bus) {
        Bus = bus;
    }

    public void setGraphic_Card(String graphic_Card) {
        Graphic_Card = graphic_Card;
    }

    public String getCPU() {
        return CPU;
    }

    public String getMemory() {
        return Memory;
    }

    public String getDisk() {
        return Disk;
    }

    public String getBus() {
        return Bus;
    }

    public String getGraphic_Card() {
        return Graphic_Card;
    }
}
