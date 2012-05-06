package euler.scala

import org.specs2.mutable.Specification

/**
 * Test class for [[euler.scala.Problem1]].
 *
 * @author Ryo TANAKA
 * @since 1.0
 */
class Problem1Spec extends Specification {
  "Fizz buzz summation" should {
    " below 10 is 23" in {
      Problem1.fizzBuzzSummation(10) must be_==(23)
    }

    " below 13 is 45" in {
      Problem1.fizzBuzzSummation(13) must be_==(45)
    }

    " below 1000 is ??" in {
      Problem1.fizzBuzzSummation(1000) must be_==(233168)
    }
  }
}
