meta-nodejs-contrib <img src="https://github.com/nodejs/nodejs.org/raw/master/static/images/logos/nodejs-new-black.png" width="128" align="right">
====================

This OpenEmbedded layer is intended to be used as an extension of [`meta-nodejs`](http://layers.openembedded.org/layerindex/branch/master/layer/meta-nodejs/) layer to provide community contributed package recipes and Bitbake helper classes.

[`meta-nodejs`](http://layers.openembedded.org/layerindex/branch/master/layer/meta-nodejs/) provides latest [Node.js](https://nodejs.org/ "Node.js") runtime package recipes for current, long-term support, maintenance and legacy release lines.

Community contributions to this layer are welcome!

Installation
============

Layer installation varies depending on your OpenEmbedded distribution. These instructions are generic.

1. Fetch `meta-nodejs-contrib` layer from `https://github.com/imyller/meta-nodejs-contrib.git`
	
2. Add `meta-nodejs-contrib` layer to `EXTRALAYERS` in `bblayers.conf`. For example:

	```bitbake
		EXTRALAYERS +=" \
			${TOPDIR}/sources/meta-nodejs-contrib \
		"
	```
	
## Dependencies

`meta-nodejs-contrib` depends on following layers:

 * [`openembedded-core`](http://layers.openembedded.org/layerindex/branch/master/layer/openembedded-core/)
 * [`meta-nodejs`](http://layers.openembedded.org/layerindex/branch/master/layer/meta-nodejs/)

Bitbake classes 
===============

`meta-nodejs-contrib` layer adds few Node.js related helper classes.

## `grunt` class

`grunt` can build a package that is based on grunt.
First it will do an `npm install` during the `do_configure` task to make sure all
dependencies are available.
Then it runs `grunt` with the default target during the `do_compile` task.

It defines the following functions:

  * `oe_rungrunt`: call `grunt`

### Variables

* `NPM_INSTALL_FLAGS`: Extra command line arguments for `npm` calls made in `do_configure` task
* `GRUNT_TARGET`: The grunt target to run. (default: "")

## `gulp` class

`gulp` can build a package that is based on gulp.
First it will do an `npm install` during the `do_configure` task to make sure all
dependencies are available.
Then it runs `gulp` with the default target during the `do_compile` task.

The project being built should have a `devDependency` on `gulp` in its `package.json`.

It defines the following functions:

  * `oe_rungulp`: call `gulp`

### Variables

* `NPM_INSTALL_FLAGS`: Extra command line arguments for `npm` calls made in `do_configure` task
* `GULP_TASKS`: The gulp task(s) to run. (default: "")
* `GULP_OPTIONS`: Extra options to pass to gulp (e.g. `--production`). (default: "")

## `bower` class

`bower` is a package manager for web applications front-end dependencies: [bower.io](http://bower.io/ "bower.io")

`bower` class defines following functions:
 
  * `oe_runbower`: call `bower` command line utility
  
### Variables

 * `BOWER`: bower command line utility (default: `bower`)
 * `BOWER_FLAGS`: Extra command line arguments for `bower` calls made by `oe_runbower()`
 * `BOWER_REGISTRY`: override Bower registry URL 
 
## `bower-install` class

Suppose a web application has front-end dependencies which are listed in the file
bower.json. In this case the web application recipe can auto-install all those
dependencies during yocto build by inheriting `bower-install` class.

`bower-install` class inherits `bower` class and adds following build tasks:

  * `bower_install`: runs `bower install` in source directory after `do_npm_dedupe` and before `do_install`

Note that front-end dependencies are auto-installed into build directory. They have to be
explicitely copied into target image in `do_install` or `do_install_append`. Here is a
simple example of web application recipe with nodejs and bower dependencies:

```bitbake
SUMMARY = "simple web application with JS front-end dependencies listed in bower.json"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

SRCREV = "${AUTOREV}"

PR = "r0"
PV = "0.0.1+git${SRCPV}"

SRC_URI = "git://webapp.example.org/test.git;branch=master;protocol=ssh"

inherit bower-install

S = "${WORKDIR}/git"

do_install () {
	install -d ${D}/www/test/public
	cp -r ${S}/bower_components ${D}/www/test/public/
}

```

### Variables

 * `BOWER_INSTALL`: Parameters for `bower install` command (such as specific package names)
 * `BOWER_INSTALL_FLAGS`: Extra command line arguments for `bower` calls made in `bower_install` task 

## `typings` class

`typings` is a TypeScript definition manager: [typings](https://github.com/typings/typings/ "typings")

`typings` class defines following functions:
 
  * `oe_runtypings`: call `typings` command line utility
  
### Variables

 * `TYPINGS`: bower command line utility (default: `typings`)
 * `TYPINGS_FLAGS`: Extra command line arguments for `typings` calls made by `oe_runtypings()`

## `typings-install` class

Suppose a web application has TypeScript dependencies which are listed in the file
typings.json. In this case the web application recipe can auto-install all those
dependencies during yocto build by inheriting `typings-install` class.

`typings-install` class inherits `typings` class and adds following build tasks:

  * `typings_install`: runs `typings install` in source directory after `do_configure` and before `do_compile`

### Variables

 * `TYPINGS_INSTALL`: Parameters for `typings install` command (such as specific package names)
 * `TYPINGS_INSTALL_FLAGS`: Extra command line arguments for `typings` calls made in `typings_install` task 
