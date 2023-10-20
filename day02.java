// Day02

// 1539. Kth Missing Positive Number 😃

// DSA with JAVA

// code:= ===========

class Solution {

  public int findKthPositive(int[] A, int k) {

    int l = 0, r = A.length, m;

    while (l < r) {

      m = (l + r) / 2;

      if (A[m] - 1 - m < k)

        l = m + 1;

      else

        r = m;

    }

    return l + k;

  }

}

// ============

// #daily challenge

// 02/100;