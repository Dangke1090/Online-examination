package cn.com.Entity;

public class ResponseResult<T> {

	private Integer state = 200;
	private String message;
	private T data;

	public ResponseResult() {
		super();
	}

	public ResponseResult(Integer state, Exception ex) {
		super();
		this.state = state;
		this.message = ex.getMessage();
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	

}
