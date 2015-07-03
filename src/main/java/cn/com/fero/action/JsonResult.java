package cn.com.fero.action;

public class JsonResult {
	private Boolean result;
	
	private String resCode;

	public JsonResult(Boolean result, String resCode){
		this.result = result;
		this.resCode = resCode;
	}
	
	public Boolean getResult() {
		return result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

	public String getResCode() {
		return resCode;
	}

	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
}
