# Lizzie - Leela Zero Interface
![screenshot](/screen.png?raw=true)

Lizzie is a graphical interface allowing the user to analyze games in
real time using [Leela Zero](https://github.com/gcp/leela-zero). You
need Java 8 or higher to run this program.

## Running a release

Just follow the instructions in the provided readme in the
[release](https://github.com/featurecat/lizzie/releases/tag/0.4).

The first run will take a while because Leela Zero needs to set up the
OpenCL tunings. Just hang tight, and wait for it to finish, then you
will see Leela Zero's analysis displayed on the board. Feel free to supply
your own tunings, as this will speed up the process. Do this by copying
any `leelaz_opencl_tuning` file you have into the directory.

## Building from source

### Building Leela Zero

First, you will need to have a special version of Leela Zero that
continually outputs pondering information. You can get this from one
of the Lizzie releases or build it yourself; just substitute
`leelaz-src/UCTSearch.cpp` for the `UCTSearch.cpp` file found in the
Leela Zero sources. Then copy the resulting `leelaz` to the root of
the Lizzie directory tree.

You will also need a file of network weights. There is one
provided in the Lizzie release package, or you can download one from
[http://zero.sjeng.org/](http://zero.sjeng.org/). Unzip the resulting .gz file (7zip is the recommended program). Save the resulting file in the Lizzie directory as "network". (with no file extension. the full name is "network", NOT network.txt).

### Building Lizzie

The simplest way to build Lizzie is to use
[Maven](https://maven.apache.org/).

To build the code and package it:

    $ mvn package

### Running Lizzie

    $ java -jar "target/lizzie-0.4-shaded.jar"

(or whatever the current version of the shaded `jar` file is in
`target/`).
