package televisorcdvd;
public class TelevisorComDVD extends Televisor {
    TelevisorComDVD() {
    }

    public String eject() {
        return "Eject ativado";
    }

    public String play() {
        return "Função Play ativada";
    }

    public String stop() {
        return "Função Stop ativada";
    }

    public String pause() {
        return "Função Pause ativada";
    }

    public static void main(String[] args) {
        TelevisorComDVD tvdvd1 = new TelevisorComDVD();
        System.out.println("O objeto tvdvd1 é " + tvdvd1.getModelo());
        System.out.println("Apertando o botão play do objeto tvdvd1: " + tvdvd1.play());
        System.out.println("Apertando o botão pause do objeto tvdvd1: " + tvdvd1.pause());
        System.out.println("Apertando o botão stop do objeto tvdvd1: " + tvdvd1.stop());
        System.out.println("Apertando o botão eject do objeto tvdvd1: " + tvdvd1.eject());
    }

	public String getModelo() {
		return null;
	}
}

