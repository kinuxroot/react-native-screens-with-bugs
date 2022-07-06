import * as React from 'react';
import {StyleProp, Text, ViewStyle} from 'react-native';
import {NavigationContainer} from '@react-navigation/native';
import {createBottomTabNavigator} from '@react-navigation/bottom-tabs';
import {SafeAreaProvider, SafeAreaView} from 'react-native-safe-area-context';

const getViewStyles = (): StyleProp<ViewStyle> => ({
  flex: 1,
  justifyContent: 'center',
  alignItems: 'center',
});

function HomeScreen() {
  return (
    <SafeAreaView style={getViewStyles()}>
      <Text>Home!</Text>
    </SafeAreaView>
  );
}

function SettingsScreen() {
  return (
    <SafeAreaView style={getViewStyles()}>
      <Text>Settings!</Text>
    </SafeAreaView>
  );
}

const Tab = createBottomTabNavigator();

export default function App() {
  return (
    <SafeAreaProvider>
      <NavigationContainer>
        <Tab.Navigator>
          <Tab.Screen name="Home" component={HomeScreen} />
          <Tab.Screen name="Settings" component={SettingsScreen} />
        </Tab.Navigator>
      </NavigationContainer>
    </SafeAreaProvider>
  );
}
