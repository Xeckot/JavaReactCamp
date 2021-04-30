package homework3;

public class Overridding {

	public static void main(String[] args) {
		BaseKrediManagerOverridding[] krediManagers = new BaseKrediManagerOverridding[] {
				new OgretmenKrediManagerOverridding(), new TarimKrediManagerOverridding(),
				new OgrenciKrediManagerOverridding() };

		for (BaseKrediManagerOverridding krediManagerOverridding : krediManagers) {
			System.out.println(krediManagerOverridding.hesapla(1000));
		}
	}

}
