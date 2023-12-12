// main.js
// a.js 와 b.js import 해서 구성요소를 사용하자.

import {fun} from './a.js';
import {fun2, Person} from './b.js';
import fun3 from './c.js';

fun();
fun2();
fun3();
var p = new Person();