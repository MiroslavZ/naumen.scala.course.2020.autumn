import homework_3.Exercises
import utest._

object Test extends TestSuite{
        val trueStr = "правда"
        val falseStr = "ложь"
        val tests: Tests = Tests{
            'prettyBooleanFormatter1 - {
                assert(Exercises.prettyBooleanFormatter1(6 > 5) == trueStr)
                assert(Exercises.prettyBooleanFormatter1(5 > 6) == falseStr)
                assert(Exercises.prettyBooleanFormatter1("0 > 5".isInstanceOf[String]) == falseStr)
                assert(Exercises.prettyBooleanFormatter1("true") == "true")
                assert(Exercises.prettyBooleanFormatter1(3) == "3")
                assert(Exercises.prettyBooleanFormatter1(4.50) == "4.5")
            }
            'prettyBooleanFormatter2 - {
                assert(Exercises.prettyBooleanFormatter2(6 > 5) == trueStr)
                assert(Exercises.prettyBooleanFormatter2(5 > 6) == falseStr)
                assert(Exercises.prettyBooleanFormatter2("0 > 5".isInstanceOf[String]) == falseStr)
                assert(Exercises.prettyBooleanFormatter2("true") == "true")
                assert(Exercises.prettyBooleanFormatter2(3) == "3")
                assert(Exercises.prettyBooleanFormatter2(4.50) == "4.5")
            }
            'prettyBooleanFormatter3 - {
                assert(Exercises.prettyBooleanFormatter3(6 > 5) == trueStr)
                assert(Exercises.prettyBooleanFormatter3(5 > 6) == falseStr)
                assert(Exercises.prettyBooleanFormatter3("0 > 5".isInstanceOf[String]) == falseStr)
                assert(Exercises.prettyBooleanFormatter3("true") == "true")
                assert(Exercises.prettyBooleanFormatter3(3) == "3")
                assert(Exercises.prettyBooleanFormatter3(4.50) == "4.5")
            }
            'test_max1 - {
                intercept[UnsupportedOperationException] {Exercises.max1(Seq())}
                assert(Exercises.max1(Seq(1)) == 1)
                assert(Exercises.max1(Seq(1, 2, 3)) == 3)
                assert(Exercises.max1(Seq(1, -2, -3)) == 1)
                assert(Exercises.max1(Seq(1, 2, 10, 3)) == 10)
                assert(Exercises.max1(Seq(-1, -2, -3, 0, 1)) == 1)
                assert(Exercises.max1(Seq(0, 0, 0)) == 0)
            }
            'test_max2 - {
                assert(Exercises.max2(Seq()) == Seq())
                assert(Exercises.max2(Seq(1)) == Seq(1))
                assert(Exercises.max2(Seq(1, 2, 3)) == Seq(3))
                assert(Exercises.max2(Seq(1, -2, -3)) == Seq(1))
                assert(Exercises.max2(Seq(1, 2, 10, 3)) == Seq(10))
                assert(Exercises.max2(Seq(-1, -2, -3, 0, 1)) == Seq(1))
                assert(Exercises.max2(Seq(0, 0, 0)) == Seq(0))
            }
            'test_max3 - {
                assert(Exercises.max3(Seq()) == None)
                assert(Exercises.max3(Seq(1)) == Some(1))
                assert(Exercises.max3(Seq(1, 2, 3)) == Some(3))
                assert(Exercises.max3(Seq(1, -2, -3)) == Some(1))
                assert(Exercises.max3(Seq(1, 2, 10, 3)) == Some(10))
                assert(Exercises.max3(Seq(-1, -2, -3, 0, 1)) == Some(1))
                assert(Exercises.max2(Seq(0, 0, 0)) == Some(0))
            }
            'sum1 - {
                assert(Exercises.sum1(2, 2) == 4)
                assert(Exercises.sum1(2, -2) == 0)
                assert(Exercises.sum1(0, 0) == 0)
                assert(Exercises.sum1(0, 2) == 2)
                assert(Exercises.sum1(0, -2) == -2)
            }
            'sum2 - {
                assert(Exercises.sum2(2, 2) == 4)
                assert(Exercises.sum2(2, -2) == 0)
                assert(Exercises.sum2(0, 0) == 0)
                assert(Exercises.sum2(0, 2) == 2)
                assert(Exercises.sum2(0, -2) == -2)
            }
            'sum3 - {
                assert(Exercises.sum3(2, 2) == 4)
                assert(Exercises.sum3(2, -2) == 0)
                assert(Exercises.sum3(0, 0) == 0)
                assert(Exercises.sum3(0, 2) == 2)
                assert(Exercises.sum3(0, -2) == -2)
            }
        }
    }
