// try {
//   console.log(add());
// } catch (error) {
//   console.error(error.message);
// } finally {
//   console.log("from finally");
// }

try {
  console.log(add());
} catch (error) {
  if (error instanceof ReferenceError) {
    console.error("reference error");
  } else if (error instanceof TypeError) {
    console.error(error.message);
  }
} finally {
  console.log("from finally");
}
