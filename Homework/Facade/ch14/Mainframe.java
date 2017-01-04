package ch14;

/**
 * Created by RayYu on 2016/12/12.
 */
public class Mainframe {
    private Memory memory;
    private CPU cpu;
    private HardDisk hardDisk;
    private OS os;

    public Mainframe(){
        memory = new Memory();
        cpu = new CPU();
        hardDisk = new HardDisk();
        os = new OS();
    }
    public void on(){
        try {
            memory.on();
            cpu.on();
            hardDisk.on();
            os.on();
        }
        catch (Exception e){
            System.out.println("启动失败");
        }
    }


    public void off(){
        memory.off();
        cpu.off();
        hardDisk.off();
        os.off();
    }

}
