# Digital Assignment - 1

Develop Java Programs implementing 10 new concepts/features/Topics (not in our syllabus).

[Final uploaded file](https://github.com/jacobjohn2016/Java-Programming/blob/master/Digital-Assignment/16BCE2205_Digital_assignment.pdf)

## Sending Email in Java through Gmail Server
* [Code](https://github.com/jacobjohn2016/Java-Programming/blob/master/Digital-Assignment/src/SendEmail.java)
* [Source](https://www.javatpoint.com/java-mail-api-tutorial)
* [`.jar` files](https://www.javatpoint.com/src/mail/mailactivation.zip)
* Steps:
  1. **Get the session object:** The `javax.mail.Session` class provides two methods to get the object of session, `Session.getDefaultInstance()` method and `Session.getInstance()` method. 
  2. **Compose the message:** The `javax.mail.Message` class provides methods to compose the message. But it is an abstract class so its subclass `javax.mail.internet.MimeMessage` class is mostly used. To create the message, you need to pass session object in `MimeMessage` class constructor. 
  3. **Resolving Authentication failure**: Click on [this link](https://www.google.com/settings/security/lesssecureapps) and click on turn on radio button to allow users to send mail from unknown location.

## Language Detection using OpenNLP
* Code - [LanguageDetectorMain.java](https://github.com/jacobjohn2016/Java-Programming/blob/master/Digital-Assignment/src/OpenNLP/languagedetector/LanguageDetectorMain.java), [LanguageMapper.java](https://github.com/jacobjohn2016/Java-Programming/blob/master/Digital-Assignment/src/OpenNLP/languagedetector/LanguageMapper.java)
* [Source](https://github.com/Ruthwik/Language-Detection)
* [`.jar` files](https://github.com/jacobjohn2016/Java-Programming/tree/master/Digital-Assignment/apache-opennlp-1.9.1/lib)
* The Apache OpenNLP library is a machine learning based toolkit for the processing of natural language text. It supports the most common NLP tasks, such as language detection, tokenization, sentence segmentation, part-of-speech tagging, named entity extraction, chunking, parsing and coreference resolution.
* This model is trained for and works well with longer texts that have at least 2 sentences or more from the same language.

## Commons Math
The Apache Commons Mathematics Library. Jar files here - [`.jar` files](https://github.com/jacobjohn2016/Java-Programming/blob/master/Digital-Assignment/commons-math3-3.6.1.jar)
### Analysis
* [Code](https://github.com/jacobjohn2016/Java-Programming/blob/master/Digital-Assignment/src/AdvancedMath/Analysis.java)
* Analysis related functions and algorithms can be found in `org.apache.commons.math3.analysis`.
* Root Finding:
  * A root is a value where a function has the value of 0. Commons-Math includes implementation of several root-finding algorithms.
  * Here, we try to find the root of *v -> (v * v) – 2* :
    ```{Java}
    UnivariateFunction function = v -> Math.pow(v, 2) - 2;
    UnivariateSolver solver = new BracketingNthOrderBrentSolver(1.0e-12, 1.0e-8, 5);
    double c = solver.solve(100, function, -10.0, 10.0, 0);
    ```
  * First, we start by defining the function, then we define the solver, and we set the desired accuracy. Finally, we call the solve() API.
  * The root-finding operation will be performed using several iterations, so it’s a matter of finding a compromise between execution time and accuracy.
* Calculating integrals:
  * The integration works almost like root finding:
    ```{Java}
    UnivariateFunction function = v -> v;
    UnivariateIntegrator integrator = new SimpsonIntegrator(1.0e-12, 1.0e-8, 1, 32);
    double i = integrator.integrate(100, function, 0, 10);
    ```
  * We start by defining a function, we choose an integrator among the available integration solutions existing, we set the desired accuracy, and finally, we integrate.
* Linear Algebra:
  * If we have a linear system of equations under the form AX = B where A is a matrix of real numbers, and B a vector of real numbers – Commons Math provides structures to represent both the matrix and the vector, and also provide solvers to find the value of X:
    ```{Java}
    RealMatrix a = new Array2DRowRealMatrix(new double[][] { { 2, 3, -2 }, { -1, 7, 6 }, { 4, -3, -5 } },false);
    RealVector b = new ArrayRealVector(new double[] { 1, -2, 1 }, false); 
    DecompositionSolver solver = new LUDecomposition(a).getSolver();
    RealVector solution = solver.solve(b);
    ```
  * The case is pretty straightforward: we define a matrix a from an array of array of doubles, and a vector b from an array of a vector.
  * Then, we create an LUDecomposition which provides a solver for equations under the form AX = B. As its name states it, LUDecomposition relies on the LU decomposition, and thus works only with square matrices.
  * For other matrices, different solvers exist, usually solving the equation using the least square method.
### Statistics and Probrabilities
* [Code](https://github.com/jacobjohn2016/Java-Programming/blob/master/Digital-Assignment/src/AdvancedMath/Stats.java)
* The package `org.apache.commons.math3.stat` provides several tools for statistical computations.
* In core Java, `Math.random()` can be used for generating random values, but these values are uniformly distributed between 0 and 1.
* Sometimes, we want to produce a random value using a more complex distribution. For this, we can use the framework provided by `org.apache.commons.math3.distribution.`
* Here is how to generate random values according to the normal distribution with the mean of 10 and the standard deviation of 3:
    ```{Java}
    NormalDistribution normalDistribution = new NormalDistribution(10, 3);
    double randomValue = normalDistribution.sample();
    ```
* Or we can obtain the probability *P(X = x)* of getting a value for discrete distributions, or the cumulative probability *P(X <= x)* for continuous distributions.

## Tokenization using Apache OpenNLP
* Code - [SentenceTokenization.java](https://github.com/jacobjohn2016/Java-Programming/blob/master/Digital-Assignment/src/OpenNLP/Tokenization/SentenceTokenization.java), [TokenizerMEProbs.java](https://github.com/jacobjohn2016/Java-Programming/blob/master/Digital-Assignment/src/OpenNLP/Tokenization/TokenizerMEProbs.java)
* [Source](https://www.tutorialspoint.com/opennlp/opennlp_tokenization.htm)
* [`.jar` files](https://github.com/jacobjohn2016/Java-Programming/tree/master/Digital-Assignment/apache-opennlp-1.9.1)
* [Model](https://github.com/jacobjohn2016/Java-Programming/blob/master/Digital-Assignment/resources/en-token.bin)

## Weka
* [Weka](https://www.cs.waikato.ac.nz/ml/weka/) is a collection of machine learning algorithms for data mining tasks. It contains tools for data preparation, classification, regression, clustering, association rules mining, and visualization.
* [`.jar` files](https://github.com/jacobjohn2016/Java-Programming/tree/master/Digital-Assignment/weka)
### K-means
* [Code](https://github.com/jacobjohn2016/Java-Programming/blob/master/Digital-Assignment/src/Weka/Cluster.java)
* [Source](https://www.programcreek.com/2014/02/k-means-clustering-in-java/)
* [Dataset](https://github.com/jacobjohn2016/Java-Programming/blob/master/Digital-Assignment/resources/data/iris.arff)
### Classification
* [Code](https://github.com/jacobjohn2016/Java-Programming/blob/master/Digital-Assignment/src/Weka/WekaTest.java)
* [Source](https://www.programcreek.com/2013/01/a-simple-machine-learning-example-in-java/)
* [Dataset](https://github.com/jacobjohn2016/Java-Programming/blob/master/Digital-Assignment/resources/weather.txt)

### JDMP
* The [Java Data Mining Package (JDMP)](https://jdmp.org/) is an open source Java library for data analysis and machine learning. It facilitates the access to data sources and machine learning algorithms (e.g. clustering, regression, classification, graphical models, optimization) and provides visualization modules. JDMP provides a number of algorithms and tools, but also interfaces to other machine learning and data mining packages (Weka, LibLinear, Elasticsearch, LibSVM, Mallet, Lucene, Octave).
* [`.jar` file](https://github.com/jacobjohn2016/Java-Programming/blob/master/Digital-Assignment/jdmp-complete-0.3.0.jar)
* [`.jar` file](https://github.com/jacobjohn2016/Java-Programming/blob/master/Digital-Assignment/ujmp-complete-0.3.0.jar)
* [Linear Regression Classification](https://github.com/jacobjohn2016/Java-Programming/blob/master/Digital-Assignment/src/jdmp/LinearRegressionClassificationExample.java)
* [Naive Bayes Classification](https://github.com/jacobjohn2016/Java-Programming/blob/master/Digital-Assignment/src/jdmp/NaiveBayesClassificationExample.java)
