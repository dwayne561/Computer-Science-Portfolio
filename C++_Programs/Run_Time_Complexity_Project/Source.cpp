#include <iostream> //  Data Stream
#include <vector>   // Vector Implementations
#include <stdlib.h> // Random Number Generator
#include <cmath>    // Floor Function
#include <chrono>   // Time


using namespace std;

// FIRST ALGORTITHM
void Insertion_Sort(int A[], int n)
{
    int i, key, j;
    for (j = 1; j < n; j++)
    {
        key = A[j];
        i = j - 1;

        while (i >= 0 && A[i] > key)
        {
            A[i + 1] = A[i];
            i = i - 1;
        }
        A[i + 1] = key;
    }
}
void ALG1(int A[], int n, int i)
{
    Insertion_Sort(A, n);
    cout << "Insert Sort    " << A[i] << endl;
}

// SECOND ALGORITHM
void Max_Heapify(int A[], int n, int i)
{
    int largest = i; // Initialize largest as root
    int l = 2 * i + 1; // left = 2*i + 1
    int r = 2 * i + 2; // right = 2*i + 2

    // If left child is larger than root
    if (l < n && A[l] > A[largest])

        largest = l;

    // If right child is larger than largest so far
    if (r < n && A[r] > A[largest])

        largest = r;

    // If largest is not root
    if (largest != i) {
        swap(A[i], A[largest]);

        // Recursively heapify the affected sub-tree
        Max_Heapify(A, n, largest);
    }
}
void Build_Max_Heap(int A[], int n)
{
    // Build heap (rearrange array)
    for (int i = n / 2 - 1; i >= 0; i--)

        Max_Heapify(A, n, i);
}
void Heap_Sort(int A[], int n)
{
    Build_Max_Heap(A, n);

    // One by one extract an element from heap

    for (int i = n - 1; i >= 0; i--) {
        // Move current root to end
        swap(A[0], A[i]);

        // call max heapify on the reduced heap
        Max_Heapify(A, i, 0);
    }
}
void ALG2(int A[], int n, int i)
{
    Heap_Sort(A, n);
    cout << "Heap Sort    " << A[i] << endl;
}

// THIRD ALGORITHM
int Partition(int A[], int p, int r) {

    int x = A[r];

    int i = p - 1;

    for (int j = p; j < r; j++) {

        if (A[j] <= x) {

            i++;

            swap(A[i], A[j]);

        }

    }

    swap(A[i + 1], A[r]);

    return i + 1;

}
int Randomized_Partition(int A[], int p, int r) {

    int i = rand() % (r - p) + p; //flag for debugging

    swap(A[i], A[r]);

    return Partition(A, p, r);

}
int Randomized_Select(int A[], int p, int r, int i)

{

    if (p == r)
    {
        return A[p];
    }
    int q = Randomized_Partition(A, p, r);

    int k = q - p + 1;

    if (i == k)
    {

        return A[q];
    }
    else if (i < k)
    {
        return Randomized_Select(A, p, q - 1, i);
    }
    else return Randomized_Select(A, q + 1, r, i - k);

}
void ALG3(int A[], int n, int i) {

    int x = Randomized_Select(A, 0, n, i);
    std::cout << "RANDOMIZED SELECT ORDERSTATISTIC   " << x << endl;
}


int main()
{
    // Rows
    int m = 5;
    // Columns
    int n = 5;

    //ALGORITHM 1
    for (n = 10000; n <= 200000; n = n + 10000)   // Set to increase columns
    {
        // Create a vector containing m vectors of size n
        vector<vector<int>> A(m, vector<int>(n));

        // Generates random values
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = rand();
            }
        }

        // Display

       /* for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                cout << A[i][j] << " ";
            }
            cout << "\n";
        }
        cout << "\n"; */

        //Input Array
        int SIZE = n;
        int* Array;
        Array = new int[SIZE];

        //Time Array
        double* TimeArray;
        TimeArray = new double[SIZE]; //size = n
        double TimeSum = 0;
        double TimeAvg = 0;

        //The Order Statistic
        int x = ceil((2 * n) / 3) - 1;

        //cout << "Ceil is  " << x;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Array[j] = A[i][j];
            }

            //cout << "\n";

            // ALGORITHM
            auto start = std::chrono::steady_clock::now();
            ALG1(Array, n, x);
            auto end = std::chrono::steady_clock::now();

            // TIME
            std::chrono::duration<double> elapsed_seconds = end - start;
            // cout << "elapsed time: " << elapsed_seconds.count() << "s\n";


            // RESULTS
            TimeArray[i] = elapsed_seconds.count();
            //cout << endl << "T " << TimeArray[i];

        }

        cout << "\n";

        // Average Time
        for (int j = 0; j < m; j++) {

            TimeSum = TimeSum + TimeArray[j];
        }

        TimeAvg = TimeSum / m;

        cout << endl << "Time Avg for Algorithm 1 with n = " << n << "is :" << TimeAvg << endl;
        cout << "\n";

    }

    //ALGORITHM 2
    for (n = 10000; n <= 200000; n = n + 10000)   // Set to increase columns
    {
        // Create a vector containing m vectors of size n
        vector<vector<int>> A(m, vector<int>(n));

        // Generates random values
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = rand();
            }
        }

        // Display

       /* for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                cout << A[i][j] << " ";
            }
            cout << "\n";
        }
        cout << "\n"; */

        //Input Array
        int SIZE = n;
        int* Array;
        Array = new int[SIZE];

        //Time Array
        double* TimeArray;
        TimeArray = new double[SIZE]; //size = n
        double TimeSum = 0;
        double TimeAvg = 0;

        //The Order Statistic
        int x = ceil((2 * n) / 3) - 1;

        //cout << "Ceil is  " << x;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Array[j] = A[i][j];
            }

            //cout << "\n";

            // ALGORITHM
            auto start = std::chrono::steady_clock::now();
            ALG2(Array, n, x);
            auto end = std::chrono::steady_clock::now();

            // TIME
            std::chrono::duration<double> elapsed_seconds = end - start;
            // cout << "elapsed time: " << elapsed_seconds.count() << "s\n";


            // RESULTS
            TimeArray[i] = elapsed_seconds.count();
            //cout << endl << "T " << TimeArray[i];

        }

        cout << "\n";

        // Average Time
        for (int j = 0; j < m; j++) {

            TimeSum = TimeSum + TimeArray[j];
        }

        TimeAvg = TimeSum / m;

        cout << endl << "Time Avg for Algorithm 2 with n = " << n << "is :" << TimeAvg << endl;
        cout << "\n";

    }

    //ALGORITHM 3
    for (n = 10000; n <= 200000; n = n + 10000)   // Set to increase columns
    {
        // Create a vector containing m vectors of size n
        vector<vector<int>> A(m, vector<int>(n));

        // Generates random values
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = rand();
            }
        }

        // Display

       /* for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                cout << A[i][j] << " ";
            }
            cout << "\n";
        }
        cout << "\n"; */

        //Input Array
        int SIZE = n;
        int* Array;
        Array = new int[SIZE];

        //Time Array
        double* TimeArray;
        TimeArray = new double[SIZE]; //size = n
        double TimeSum = 0;
        double TimeAvg = 0;

        //The Order Statistic
        int x = ceil((2 * n) / 3) - 1;

        //cout << "Ceil is  " << x;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Array[j] = A[i][j];
            }

            //cout << "\n";

            // ALGORITHM
            auto start = std::chrono::steady_clock::now();
            ALG3(Array, n, x);
            auto end = std::chrono::steady_clock::now();

            // TIME
            std::chrono::duration<double> elapsed_seconds = end - start;
            // cout << "elapsed time: " << elapsed_seconds.count() << "s\n";


            // RESULTS
            TimeArray[i] = elapsed_seconds.count();
            //cout << endl << "T " << TimeArray[i];

        }

        cout << "\n";

        // Average Time
        for (int j = 0; j < m; j++) {

            TimeSum = TimeSum + TimeArray[j];
        }

        TimeAvg = TimeSum / m;

        cout << endl << "Time Avg for Algorithm 3 with n = " << n << "is :" << TimeAvg << endl;
        cout << "\n";

    }

    return 0;
}