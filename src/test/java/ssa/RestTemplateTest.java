package ssa;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class RestTemplateTest {
	@Test
	public void テスト() throws Exception {
		// 通信のテスト書くよー
		// サービス在庫とつながってるかみるよ。
		// URL=http://52.87.255.56:8091/swagger-ui.html#!/stock-controller/getStockUsingGET

		Stock template = new RestTemplate()
				.getForObject("http://52.87.255.56:8091/api/stock/a8ac6ecc-b5ce-4a4c-bc05-890e17f29da0", Stock.class);

		assertThat(template.getValue()).isEqualTo("54");

	}
}
