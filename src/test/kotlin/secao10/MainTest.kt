package secao10

import org.junit.jupiter.api.*
import secao10.abc
import secao10.countXO

class MainTest {

    @Test
    @DisplayName("Teste método xxoo")
    fun testCountXO() {
        //todos metodos serem executados independente se um falhar
        Assertions.assertAll(
            //{Assertions.assertTrue(countXO("xxooxx"))},
            {Assertions.assertTrue(countXO("xxoo"))},
           //{Assertions.assertTrue(countXO("xxOo"))},
            //{Assertions.assertTrue(countXO("Xxoo"))},
        )
    }
    @Test
    @Disabled
    fun naoImplementado() {

    }

    @Test
    fun vaiFalhar() {
        fail("Não posso terminar os testes sem esse metodo")
    }

    @Test
    fun assumption() {
     //   Assumptions.assumeTrue(countXO("xxoo"))
       // Assertions.assertTrue(abc())
    }

    @Test
    fun exception() {
        assertThrows<NullPointerException> { abc() }
    }

}