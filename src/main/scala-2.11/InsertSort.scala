/**
  * Created by abhsrivastava on 8/25/16.
  */
object InsertSort extends App {
   def insertSort[A <% Ordered[A]](input: List[A]): List[A] = {
      input.foldLeft[List[A]](List[A]()){(a, x) =>
         val (smaller, greater) = a.span(x > _)
         smaller ::: (x :: greater)
      }
   }
   insertSort(List(9, 10, 0, 15, -1)).foreach(println)
}
