package comm.example.ecxeption;

public class AccountNotValidException extends Throwable {
	
	private static final long serialVersionUID = 7596462641713026596L;
	private String msg;

	public AccountNotValidException() {
		super();
	}

	public AccountNotValidException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
