package euler.scala

import org.specs2.mutable.Specification

/**
 * Test class for [[euler.scala.Problem2]].
 *
 * @author Ryo TANAKA
 * @since 1.0
 */
class Problem2Spec extends Specification {
  "Fibonacci Even Summation" should {
    " below 10 is 10" in {
      Problem2.fibEvenSum(10) must be_==(10)
    }

    " below 35 is 44" in {
      Problem2.fibEvenSum(35) must be_==(44)
    }

    " below 4000000 is 4613732" in {
      Problem2.fibEvenSum(4000000) must be_==(4613732)
    }
  }
}
