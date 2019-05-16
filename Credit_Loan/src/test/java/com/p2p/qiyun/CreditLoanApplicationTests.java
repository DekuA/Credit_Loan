package com.p2p.qiyun;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.p2p.qiyun.hjh.dao.BalanceMapper;
import com.p2p.qiyun.hjh.entity.Balance;
import com.p2p.qiyun.lxm.dao.BalanceMapperlxm;




@RunWith(SpringRunner.class)
@SpringBootTest
public class CreditLoanApplicationTests {
	@Autowired
private BalanceMapper q;

	@Test
	public void contextLoads() {
System.out.println("------=----------------");
Balance b = q.selectBalanceBy(1);
b.setBalance(700.00);
		q.updateBalace(b);
	}

}
