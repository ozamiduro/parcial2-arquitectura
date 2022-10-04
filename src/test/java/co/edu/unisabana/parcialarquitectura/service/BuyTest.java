package co.edu.unisabana.parcialarquitectura.service;

import co.edu.unisabana.parcialarquitectura.repository.Database;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

class BuyTest {

  private Buy buy;


  @Test
  public void Given_vendor_and_buyer_code_equals_When_Buy_Result_IllegalSaleException() {
    buy.makePurchase(12, 12, "Zapato");
    assertThrows(IllegalSaleException.class, () -> {});


  }

  @Test
  public void Given_product_save_in_db_When_Buy_Then_Result_product_sold(){
    String result = buy.makePurchase(12, 1, "Zapato");
    assertEquals("Product sold", result);
  }

  @Test
  public void Given_product_not_save_in_db_When_Buy_Then_Result_sale_not_possible() {
    String result = buy.makePurchase(12, 0, "");
    assertEquals("The sale was not possible", result);
  }

}