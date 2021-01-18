package com.example.api.data.junction.VO;

public class ResponseTemplate {
    public boolean success;
    public String error;
    public Object data;


    public ResponseTemplate(boolean success) {
        this.success = success;
    }

    public ResponseTemplate() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
