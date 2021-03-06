'use strict';

var React = require('react-native');
var To=require('./SampleToast');
var NativeParamManage=require('./NativeParamManage');
var {
  Text,
  TouchableHighlight,
  View
} = React;

var MyAwesomeApp = React.createClass ({
  render: function() {
    return (
      <TouchableHighlight onPress={this._onPressButton}>
            <Text style={styles.hello}>Hello, World</Text>
      </TouchableHighlight>
    );
  },
    _onPressButton: function() {
     To.show("toast事件",To.SHORT);
    },
      componentDidMount: function() {
         NativeParamManage.getParam((msg) => {
            To.show(msg.name,To.SHORT);
           });
      },
});
var styles = React.StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
  },
  hello: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
});

React.AppRegistry.registerComponent('MyAwesomeApp', () => MyAwesomeApp);