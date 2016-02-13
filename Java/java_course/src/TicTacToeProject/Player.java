package TicTacToeProject;

class Player {

	private String name;
	private String sign;

	public Player(String name, String sign) {

		if ("".equals(name)) {
			System.out.println("Invalid player name");
		} else {
			setName(name);
		}
		if ("".equals(sign)) {
			System.out.println("Invalid player sign");
		} else {
			setSign(sign);
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

}
