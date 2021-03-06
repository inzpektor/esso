package dk.langli.esso;

import java.net.URI;

import org.apache.http.client.methods.HttpPost;

class HttpGet extends HttpPost {
	public final static String METHOD_NAME = "GET";

	public HttpGet(URI url) {
		super(url);
	}

	public HttpGet(String url) {
		super(url);
	}

	@Override
	public String getMethod() {
		return METHOD_NAME;
	}
}
