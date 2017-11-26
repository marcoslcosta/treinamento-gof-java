
public class TomadaAmericana extends Tomada<PlugAmericano> {

	@Override
	public String getNomeRede() {
		return "Tomada americana";

	}

	@Override
	public String conecta(PlugAmericano plug) {
		return plug.obtemEletricidade() + this.getNomeRede();
	}

}
