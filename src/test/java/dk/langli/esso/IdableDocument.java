package dk.langli.esso;

import dk.langli.esso.Idable;

public class IdableDocument extends Document implements Idable {
	@Override
	public String get_id() {
		return super.get_id();
	}

	@Override
	public void set_id(String _id) {
		super.set_id(_id);
	}
}
