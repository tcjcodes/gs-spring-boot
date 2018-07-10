var baseConfig = require('./webpack.base');

/**
 * Webpack configuration for Production bundling.
 */
module.exports = Object.assign({}, baseConfig, {
    /**
     * To read more about the 'mode' property:
     * @see [webpack 4: mode and optimization]{@link https://medium.com/webpack/webpack-4-mode-and-optimization-5423a6bc597a}
     */
    mode: 'production',

    /**
     * @see [Using source maps]{@link https://webpack.js.org/guides/development/#using-source-maps}
     * @see [devtool Docs]{@link https://webpack.js.org/configuration/devtool}
     */
    devtool: 'source-map', // Production-level source map

});