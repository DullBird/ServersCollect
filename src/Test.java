import org.hyperic.sigar.Cpu;
import org.hyperic.sigar.Mem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.cmd.Free;
import org.hyperic.sigar.cmd.MemWatch;


public class Test {
	
	public static void main(String[] args) {
		Sigar sigar = new Sigar();
		try {
			Mem mem = sigar.getMem();
			System.out.println("#内存总量：" + mem.getTotal() / 1024 / 1024 + "M");
            System.out.println("#已使用内存：" + mem.getUsed() / 1024 / 1024 + "M");
            System.out.println("#剩余内存：" + mem.getFree() / 1024 / 1024 + "M");
            Cpu[] cpus = sigar.getCpuList();
            System.out.println(cpus.length);
		} catch (SigarException e) {
			e.printStackTrace();
		}
		
	}

}
