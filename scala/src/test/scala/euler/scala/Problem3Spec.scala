package euler.scala

import org.specs2.mutable.Specification
import org.specs2.matcher.DataTables

/**
 * Test class for [[Problem3]].
 *
 * @author Ryo TANAKA
 * @since 1.0
 */
class Problem3Spec extends Specification with DataTables {
  "The largest prime factor computation" should {
    " return largest prime factor of specified number" in {
      "number" | "result" |>
        2L ! 2L |
        3L ! 3L |
        4L ! 2L |
        6L ! 3L |
        13195L ! 29L |
        600851475143L ! 6857L |
        4611686018427387904L ! 2L |> {
        (number, result) => Problem3.maxPrime(number) must_== result
      }
    }
  }
}
