package euler.scala

/**
 * Problem 3 (the Largest Prime Factor)
 * <p/>
 * The prime factors of 13195 are 5, 7, 13 and 29.<br />
 * What is the largest prime factor of the number 600851475143 ?
 *
 * @author Ryo TANAKA
 * @since 1.0
 */
object Problem3 {
  def maxPrime(num: Long) = {
    var limit = num
    lazy val primes: Stream[Long] =
      2 #:: primes.map(x => {
        // Stream#range(start, end) excludes end value.
        Stream.range(x, limit + 1).find(limit % _ == 0) match {
          case Some(prime) => limit = limit / prime; prime
          case None => x
        }
      })
    primes.take(10).last
  }
}
