package com.blockchain.example.micsa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;

import java.math.BigInteger;


@SpringBootApplication()
@EnableAutoConfiguration()
public class MicsaApplication implements CommandLineRunner {
    private static Logger LOG = LoggerFactory.getLogger(MicsaApplication.class);

    public static void main(String[] args) {
    	SpringApplication.run(MicsaApplication.class, args);
	}

    @Override
    public void run(String... args) {
		MicsaContractService service = new MicsaContractService();

		String id = "0x3133000000000000000000000000000000000000000000000000000000000000";
		String investor = "Investment SA";

		TransactionReceipt res = service.registerOrder(id,investor);

	}
}