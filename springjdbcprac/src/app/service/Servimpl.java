package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.dao.*;
import app.pojos.Rregister;

@Service
public class Servimpl implements Servinter {
@Autowired
private Daoimpl di;
	@Override
	public void insert(Rregister r) {
		// TODO Auto-generated method stub
   System.out.println("in service insert");
   di.insert(r);
	}
	@Override
	public void retrival(Rregister r) {
		// TODO Auto-generated method stub
		System.out.println("in retrival service");
		di.retrival(r);
	}

}
