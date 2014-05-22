import funsets.FunSets
import funsets.FunSets._

val s1 = singletonSet(1)
val s2 = singletonSet(2)
val s3 = singletonSet(3)

FunSets.contains(s1,1)
FunSets.contains(s1,2)

FunSets.contains(s2,2)
FunSets.contains(s2,3)

FunSets.contains(s3,3)
FunSets.contains(s3,4)

FunSets.toString(FunSets.union(s1,s2))
FunSets.toString(FunSets.intersect(s1,s2))

FunSets.toString(FunSets.diff(FunSets.union(s1,s2),s2))

FunSets.toString(FunSets.filter(FunSets.union(s1,s2), x=> x == 2))

FunSets.forall(FunSets.intersect(s1,s2), x=> x == 3)

FunSets.exists(FunSets.union(s1,s2), x=> x == 4)

FunSets.toString(FunSets.map(FunSets.union(s1,s2), x=> x*4))
